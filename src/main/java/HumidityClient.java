import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import com.ncirl.streaming.humidityservice.HumidityInfo;
import com.ncirl.streaming.humidityservice.HumidityServiceGrpc;
import com.ncirl.util.CSVUtil;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class HumidityClient {

    private  ManagedChannel channel;

    private String humidity ;

    private  HumidityServiceGrpc.HumidityServiceStub stub;

    private  ConsulClient consulClient;

    public HumidityClient(String consulHost, int consulPort) {
//        this.channel = ManagedChannelBuilder.forAddress(host, port)
//                .usePlaintext()
//                .build();
//        //this.stub = StreamingClientServiceGrpc.newStub(channel);
//        this.stub = HumidityServiceGrpc.newStub(channel);

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
        this.stub = HumidityServiceGrpc.newStub(channel);

    }

    public void receiveHumidity() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);
        String fileName = "humidity_his" + formattedDate + ".csv";
        CSVUtil.appendStringToFile(fileName,"time,humidity");
        final int[] time = {0};

        StreamObserver<HumidityInfo> responseObserver = new StreamObserver<HumidityInfo>() {
            @Override
            public void onNext(HumidityInfo response) {
                String content = response.getTime() +"," + response.getHumidity();
                CSVUtil.appendStringToFile(fileName,content);
                if (time[0] ==0){
                    System.out.println("current humidity is " + response.getHumidity());
                }
                time[0] +=1;
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in server streaming: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
               // System.out.println("receiveHumidity completed");
            }
        };
        stub.getRealHumidity(HumidityInfo.newBuilder().build(), responseObserver);
    }




    public void shutdown() throws InterruptedException {
        //channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
       // channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        channel.shutdown().shutdownNow();

    }

}

