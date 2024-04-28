import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import com.ncirl.streaming.storeservice.ProductInfo;
import com.ncirl.streaming.storeservice.ProductInfos;
import com.ncirl.streaming.storeservice.StoreServiceGrpc;
import com.ncirl.util.StoreDB;
import com.ncirl.util.TableUtil;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
//import java.util.concurrent.TimeUnit;

public class StoreClient {

    private  ManagedChannel channel;
    //private final StreamingClientServiceGrpc.StreamingClientServiceStub stub;

    private  StoreServiceGrpc.StoreServiceStub stub;

    private final ConsulClient consulClient;

    public StoreClient(String consulHost, int consulPort) {
        this.consulClient = new ConsulClient(consulHost, consulPort);
        init();
    }


    private void init(){
        String consulServiceName = "store-service";
        List<HealthService> healthServices = consulClient.getHealthServices(consulServiceName, true, null).getValue();
        if (healthServices.isEmpty()) {
            System.err.println("No healthy instances of " + consulServiceName + " found in Consul.");
            return;
        }
        HealthService healthService = healthServices.get(0);
        // Extract host and port from the service details
        String serverHost = healthService.getService().getAddress();
        int serverPort = healthService.getService().getPort();
        this.channel = ManagedChannelBuilder.forAddress(serverHost, serverPort)
                .usePlaintext()
                .build();
        this.stub = StoreServiceGrpc.newStub(channel);

    }

    // 获取全部的产品库存信息
    public void getProductsInfo(String productNo) {
        ProductInfo request = ProductInfo.newBuilder()
                .setProductNo(productNo)
                .build();
        stub.getProductsInfo(request, new StreamObserver<ProductInfos>() {
            @Override
            public void onNext(ProductInfos response) {
                List<ProductInfo> productsList = response.getProductsList();
                //System.out.println("getProductsInfo response from server: " );
                TableUtil.showProductInfos(productsList);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in getProductsInfo: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                //System.out.println("getProductsInfo completed");
            }
        });
    }




    public void upload(String filename) {
        StreamObserver<ProductInfo> requestObserver = stub.upload(new StreamObserver<ProductInfos>() {
            @Override
            public void onNext(ProductInfos response) {
                //System.out.println("Server response: " + response.getProducts(0));
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in streaming client information: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("upload success!!!");
            }
        });

        List<ProductInfo> productInfos = StoreDB.loadCSV(filename);
        try {
            while (true) {
                for (int i = 0; i < productInfos.size(); i++) {
                    ProductInfo productInfo = productInfos.get(i);
                    requestObserver.onNext(productInfo);
                    Thread.sleep(1);
                }
                break;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        requestObserver.onCompleted();
    }




    public void updateProductInfo(String productNo,int count) {
        ProductInfo request = ProductInfo.newBuilder()
                .setProductNo(productNo)
                .setCount(count)
                .build();

        stub.updateProductInfo(request, new StreamObserver<ProductInfos>() {

            @Override
            public void onNext(ProductInfos response) {
                List<ProductInfo> productsList = response.getProductsList();
                TableUtil.showProductInfos(productsList);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in updateProductInfo: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                //System.out.println("updateProductInfo completed");
            }
        });
    }



    public void downloadStore() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);
        String fileName = "download_store_" + formattedDate + ".csv";
        // 新建文件
        StoreDB.newCsv(fileName);

        StreamObserver<ProductInfo> responseObserver = new StreamObserver<ProductInfo>() {
            @Override
            public void onNext(ProductInfo response) {
                StoreDB.addToCsv(fileName,response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in server streaming: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("downloadStore completed");
            }
        };

        stub.getAllProductsInfo(ProductInfo.newBuilder().build(), responseObserver);
    }




    public void shutdown() throws InterruptedException {
        //channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
       // channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        channel.shutdown().shutdownNow();

    }

    public static void main(String[] args) throws InterruptedException {
        String host = "localhost";
        int port = 8500;
        String clientName = "Client01.ncirl.com";

        StoreClient client = new StoreClient(host, port);

        String productNo = "cde";
        client.getProductsInfo(productNo);

        client.getProductsInfo("");

        client.downloadStore();


        client.updateProductInfo("ttt",1000);

        client.upload("upload_store.csv");


        // Start streaming client information
//        Thread streamThread = new Thread(() -> client.streamClientInformation(clientName));
//        streamThread.start();

        // Wait for user input to stop streaming
        System.out.println("Press 'Q' to stop streaming client information");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                //streamThread.interrupt();
                break;
            }
        }

        // Shutdown client
        client.shutdown();
    }
}

