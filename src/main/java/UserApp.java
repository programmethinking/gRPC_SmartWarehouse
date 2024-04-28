import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserApp {

    public static StoreClient storeClient ;

    public static TempClient tempClient ;

    public static HumidityClient humidityClient ;

    public static void init(){
        String host = "localhost";
        int port = 8500;
        storeClient = new StoreClient(host, port);
        tempClient = new TempClient(host,port);
        humidityClient = new HumidityClient(host,port);
    }


    public static void main(String[] args) throws InterruptedException {

        init();
        try {

            startListen();

            run();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            shutdown();
        }
        // Shutdown client
    }

    private static void startListen() {
//        System.out.println("client start receive temperature from server");
//        tempClient.receiveTemperature();
//
//        System.out.println("client start receive humidity from server");
//        humidityClient.receiveHumidity();
    }

    public static void shutdown() throws InterruptedException {
        storeClient.shutdown();
        tempClient.shutdown();
        humidityClient.shutdown();
    }

    public static void showMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Get product stock");
        System.out.println("2. Get all products stock");
        System.out.println("3. download inventory to file");
        System.out.println("4. Update a product stock");
        System.out.println("5. Update inventory from file");
        System.out.println("6. Start synchronizing temperature ");
        System.out.println("7. Start synchronizing humidity");

        System.out.println("Q. Exit");
    }


    public static void run() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.println("Option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Enter productNo:");
                    String productNo = scanner.nextLine();
                    storeClient.getProductsInfo(productNo);
                    break;
                case "2":
                    storeClient.getProductsInfo("");
                    break;
                case "3":
                    System.out.println("Enter file name:");
                    storeClient.downloadStore();
                    break;
                case "4":
                    System.out.println("Enter product number:");
                    String productToUpdate = scanner.nextLine();
                    System.out.println("Enter new stock count:");
                    int newStock = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    storeClient.updateProductInfo(productToUpdate,newStock);
                    break;
                case "5":
                    System.out.println("Enter a file name to upload:");
                    String importFileName = scanner.nextLine();
                    Path path = Paths.get(importFileName);
                    boolean exists = Files.exists(path);
                    if (exists) {
                        storeClient.upload(importFileName);
                    } else {
                        System.out.println("File does not exist.");
                    }
                    break;
                case "6":
                    tempClient.receiveTemperature();
                    System.out.println("Start synchronizing temperature successfluly ");
                    break;
                case "7":
                    humidityClient.receiveHumidity();
                    System.out.println("Start synchronizing humidity successfluly ");
                    break;
                case "Q":
                    shutdown();
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }

        }
    }

}