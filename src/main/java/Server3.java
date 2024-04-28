import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import com.ncirl.streaming.humidityservice.HumidityInfo;
import com.ncirl.streaming.humidityservice.HumidityServiceGrpc;
import com.ncirl.streaming.storeservice.ProductInfo;
import com.ncirl.streaming.storeservice.ProductInfos;
import com.ncirl.streaming.storeservice.StoreServiceGrpc;
import com.ncirl.streaming.temperatureservice.TemperatureInfo;
import com.ncirl.streaming.temperatureservice.TemperatureServiceGrpc;
import com.ncirl.util.HumidityUtil;
import com.ncirl.util.StoreDB;
import com.ncirl.util.TemperatureUtil;
import com.ncirl.util.TimeUtil;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Server3 {

    private io.grpc.Server server;

    public void start() throws IOException {


        String configPath = "src/main/resources/consul3.properties";
        registerToConsul(configPath);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server");
            try {
                Server3.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
        }));
    }


    private void registerToConsul(String configPath) throws IOException {
        System.out.println("Registering server to Consul...");

        // Load Consul configuration from consul.properties file
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream(configPath)) {
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Extract Consul configuration properties
        String consulHost = props.getProperty("consul.host");
        int consulPort = Integer.parseInt(props.getProperty("consul.port"));
        String serviceName = props.getProperty("consul.service.name");
        int servicePort = Integer.parseInt(props.getProperty("consul.service.port"));
        String healthCheckInterval = props.getProperty("consul.service.healthCheckInterval");

        server = ServerBuilder.forPort(servicePort)
                .addService(new StoreServiceImpl())
                .addService(new TemperatureServiceImpl())
                .addService(new HumidityServiceImpl())
                .build()
                .start();

        System.out.println("Server started, listening on port " + servicePort);

        // Get host address
        String hostAddress;
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return;
        }

        // Create a Consul client
        ConsulClient consulClient = new ConsulClient(consulHost, consulPort);

        // Define service details
        NewService newService = new NewService();
        newService.setName(serviceName);
        newService.setPort(servicePort);
        newService.setAddress(hostAddress); // Set host address

        // Register service with Consul
        consulClient.agentServiceRegister(newService);

        // Print registration success message
        System.out.println("Server registered to Consul successfully. Host: " + hostAddress);
    }



    private void stop() throws InterruptedException {
        if (server != null) {
            //server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            server.shutdownNow();
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private static class TemperatureServiceImpl extends TemperatureServiceGrpc.TemperatureServiceImplBase{

        @Override
        public void getRealTemperature(TemperatureInfo request, StreamObserver<TemperatureInfo> responseObserver) {

            Runnable streamingTask = () -> {
                try {
                    while (!Thread.currentThread().isInterrupted()) {
                        String warehouseTemperature = TemperatureUtil.getWarehouseTemperature();
                        String currentTime = TimeUtil.getCurrentTime();
                        TemperatureInfo temperatureInfo = TemperatureInfo.newBuilder().setTemp(warehouseTemperature)
                                .setTime(currentTime).build();
                        responseObserver.onNext(temperatureInfo);
                        Thread.sleep(1000); // Stream every 1 seconds
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    responseObserver.onCompleted();
                }
            };

            Thread streamingThread = new Thread(streamingTask);
            streamingThread.start();
        }
    }


    private static class HumidityServiceImpl extends HumidityServiceGrpc.HumidityServiceImplBase{

        @Override
        public void getRealHumidity(HumidityInfo request, StreamObserver<HumidityInfo> responseObserver) {

            Runnable streamingTask = () -> {
                try {
                    while (!Thread.currentThread().isInterrupted()) {
                        String warehouseTemperature = HumidityUtil.getWarehouseHumidity();
                        String currentTime = TimeUtil.getCurrentTime();
                        HumidityInfo humidityInfo = HumidityInfo.newBuilder().setHumidity(warehouseTemperature)
                                .setTime(currentTime).build();
                        responseObserver.onNext(humidityInfo);
                        Thread.sleep(1000); // Stream every 1 seconds
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    responseObserver.onCompleted();
                }
            };

            Thread streamingThread = new Thread(streamingTask);
            streamingThread.start();
        }
    }


    private static class StoreServiceImpl extends StoreServiceGrpc.StoreServiceImplBase {

        @Override
        public StreamObserver<ProductInfo> upload(StreamObserver<ProductInfos> responseObserver) {

            //return super.upload(responseObserver);
            return new StreamObserver<ProductInfo>() {
                @Override
                public void onNext(ProductInfo clientInfo) {
                    System.out.println("Received client information:");
//                    System.out.println("Client Name: " + clientInfo.getClientName());
//                    System.out.println("Date and Time: " + clientInfo.getDateTime());
                    ArrayList<ProductInfo> productInfos = new ArrayList<>();
                    productInfos.add(clientInfo);
                    StoreDB.updateCSV(productInfos);

                }

                @Override
                public void onError(Throwable t) {
                    System.err.println("Error in client information streaming: " + t.getMessage());
                }

                @Override
                public void onCompleted() {
                    List<ProductInfo> productInfos = StoreDB.loadCSV();
                    ProductInfos response = ProductInfos.newBuilder()
                            .addAllProducts(productInfos)
                            .build();
                    responseObserver.onNext(response);
                    responseObserver.onCompleted();
                }
            };

        }

        @Override
        public void updateProductInfo(ProductInfo request, StreamObserver<ProductInfos> responseObserver) {

            System.out.println("updateProductInfo");
            List<ProductInfo> productInfos = new ArrayList<>();
            productInfos.add(request);
            StoreDB.updateCSV(productInfos);

            List<ProductInfo> dbProductInfos = StoreDB.loadCSV();
            ProductInfos response = ProductInfos.newBuilder()
                    .addAllProducts(dbProductInfos)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getProductsInfo(ProductInfo request, StreamObserver<ProductInfos> responseObserver) {

            String message = "Received unary request from client: " + request.getProductNo();
            System.out.println("getProductsInfo");
            System.out.println(message);
            List<ProductInfo> productInfos ;
            if(!request.getProductNo().isEmpty() && !request.getProductNo().equals("")){
                productInfos= StoreDB.queryByProductNo(request.getProductNo());
            }else {
                productInfos = StoreDB.loadCSV();
            }
            ProductInfos response = ProductInfos.newBuilder()
                    .addAllProducts(productInfos)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        }


        @Override
        public void getAllProductsInfo(ProductInfo request, StreamObserver<ProductInfo> responseObserver) {
            //String serverName = request.getServerName();
            Runnable streamingTask = () -> {
                try {
                    List<ProductInfo> productInfos = StoreDB.loadCSV();
                    int i = 0;
                    while (!Thread.currentThread().isInterrupted() && i < productInfos.size()) {
                        //String message = "This is a message from the server: " + serverName + ". Current time: " + LocalDateTime.now();
//                        StreamServerResponse response = ProductInfo.newBuilder()
//                                .setMessage(message)
//                                .build();
                        ProductInfo productInfo = productInfos.get(i);
                        responseObserver.onNext(productInfo);
                        Thread.sleep(1); // Stream every 5 seconds
                        i+=1;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    responseObserver.onCompleted();
                }
            };

            Thread streamingThread = new Thread(streamingTask);
            streamingThread.start();
        }

    }


//        @Override
//        public void sendUnaryRequest(UnaryRequest request, StreamObserver<UnaryResponse> responseObserver) {
//            String message = "Received unary request from client: " + request.getName();
//            UnaryResponse response = UnaryResponse.newBuilder()
//                    .setMessage(message)
//                    .build();
//            responseObserver.onNext(response);
//            responseObserver.onCompleted();
//        }

//        @Override
//        public void getProductsInfo(ProductInfo request, StreamObserver<ProductInfos> responseObserver) {
//            //String message = "Received unary request from client: " + request.getName();
//            System.out.println("getProductsInfo");
//            System.out.println(request.getProductNo());
//            ArrayList<ProductInfo> productInfos = new ArrayList<>();
//            ProductInfo productInfo = ProductInfo.newBuilder().setProductNo("1231").setCount(12).build();
//            productInfos.add(productInfo);
//
//            ProductInfos response = ProductInfos.newBuilder()
//                    .addAllProducts(productInfos)
//                    .build();
//            responseObserver.onNext(response);
//            responseObserver.onCompleted();
//        }


//        @Override
//        public StreamObserver<ClientInformation> streamClientInformation(StreamObserver<ServerResponse> responseObserver) {
//            return new StreamObserver<ClientInformation>() {
//                @Override
//                public void onNext(ClientInformation clientInfo) {
//                    System.out.println("Received client information:");
//                    System.out.println("Client Name: " + clientInfo.getClientName());
//                    System.out.println("Date and Time: " + clientInfo.getDateTime());
//                }
//
//                @Override
//                public void onError(Throwable t) {
//                    System.err.println("Error in client information streaming: " + t.getMessage());
//                }
//
//                @Override
//                public void onCompleted() {
//                    System.out.println("Client information streaming completed");
//                    ServerResponse response = ServerResponse.newBuilder()
//                            .setMessage("Client information streaming completed")
//                            .build();
//                    responseObserver.onNext(response);
//                    responseObserver.onCompleted();
//                }
//            };
//        }







    public static void main(String[] args) throws IOException, InterruptedException {
        Server3 server = new Server3();
        server.start();
        server.blockUntilShutdown();
    }
}
