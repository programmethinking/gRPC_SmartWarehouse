import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import com.ncirl.streaming.storeservice.StoreServiceGrpc;
import com.ncirl.streaming.temperatureservice.TemperatureInfo;
import com.ncirl.streaming.temperatureservice.TemperatureServiceGrpc;
import com.ncirl.util.CSVUtil;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TempClient {

    private  ManagedChannel channel;

    private  TemperatureServiceGrpc.TemperatureServiceStub stub;

    private final ConsulClient consulClient;



    public TempClient(String consulHost, int consulPort) {
//        this.channel = ManagedChannelBuilder.forAddress(host, port)
//                .usePlaintext()
//                .build();
//        //this.stub = StreamingClientServiceGrpc.newStub(channel);
//        this.stub = TemperatureServiceGrpc.newStub(channel);

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
        this.stub = TemperatureServiceGrpc.newStub(channel);

    }

    public void receiveTemperature() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);
        String fileName = "temperature_his" + formattedDate + ".csv";
        // 新建文件
        CSVUtil.appendStringToFile(fileName,"time,temp");

        final int[] time = {0};

        StreamObserver<TemperatureInfo> responseObserver = new StreamObserver<TemperatureInfo>() {
            @Override
            public void onNext(TemperatureInfo response) {
                String content = response.getTime() +"," + response.getTemp();
                CSVUtil.appendStringToFile(fileName,content);

                if (time[0] ==0){
                    System.out.println("current temperature is " + response.getTemp());
                }
                time[0] +=1;
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in server streaming: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                //System.out.println("receiveTemperature completed");
            }
        };
        stub.getRealTemperature(TemperatureInfo.newBuilder().build(), responseObserver);
    }




    public void shutdown() throws InterruptedException {
        //channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
       // channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        channel.shutdown().shutdownNow();

    }

}

