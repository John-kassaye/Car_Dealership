package CarDealership;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    private Dealership dealership;

    UserInterface(){}

    public void display(){
        init();
        int choice = 0;
        while (choice != 99){

          try {
              display2();
              choice = scanner.nextInt();
              scanner.nextLine();

              switch (choice) {
                  case 1:
                      System.out.println("""
                              Enter the minimum and maximum values respectively
                              """);

                      double min = scanner.nextDouble();
                      double max = scanner.nextDouble();
                      processGetByPriceRequest(min,max);
                      break;
                  case 2:
                      System.out.println("""
                              Enter the make or model
                              """);

                      scanner.nextLine();
                      String makeModel = scanner.nextLine();
                      processGetByMakeModeRequest(makeModel);
                      break;
                  case 3:
                      System.out.println("""
                              Enter the minimum and maximum year respectively
                              """);

                      double vehicleMinYear = scanner.nextDouble();
                      double vehicleMaxYear = scanner.nextDouble();
                      processGetByYearRequest(vehicleMinYear,vehicleMaxYear);
                      break;
                  case 4:
                      System.out.println("""
                              Enter the color of vehicle
                              """);

                      String vehicleColor = scanner.nextLine();
                      processGetByColorRequest(vehicleColor);
                      break;
                  case 5:
                      System.out.println("""
                              Enter the minimum and maximum mile age of vehicle
                              """);

                      double minMileAge = scanner.nextDouble();
                      double maxMileAge = scanner.nextDouble();
                      processGetByMileageRequest(minMileAge,maxMileAge);
                      break;
                  case 6:
                      System.out.println("""
                              Enter the type of vehicle
                              """);

                      String vehicleType = scanner.nextLine();
                      processGetByVehicleTypeRequest(vehicleType);
                      break;
                  case 7:
                      processGetByAllVehicleRequest();
                      break;
                  case 8:
                      processGetByAddVehicleRequest();
                      break;
                  case 9:
                      processGetByRemoveVehicleRequest();
                      break;
                  case 99:
                      System.out.println("Thank you!");
                      break;
                  default:
                      System.out.println("Invalid input");
              }
          } catch (Exception e) {
              System.out.println("Please enter a number");
          }
        }
    }

    private void init(){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership =  dealershipFileManager.getDealership();
    }

    private void displayVehicle(List<Vehicle> vehicle){
        if (vehicle.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }

        for (Vehicle vehicle1 : vehicle){
            System.out.println(vehicle1.saveFormat());
        }
    }

    public void display2(){
        System.out.println("""
                    1 - Find vehicles within a price range
                    2 - Find vehicles by make / model
                    3 - Find vehicles by year range
                    4 - Find vehicles by color
                    5 - Find vehicles by mileage range
                    6 - Find vehicles by type (car, truck, SUV, van)
                    7 - List ALL vehicles
                    8 - Add a vehicle
                    9 - Remove a vehicle
                    99 - Quit
                    """);
    }
    
    public void processGetByPriceRequest(double min, double max){
        Dealership dealership = new Dealership("John","WA","221-112-9646");
        displayVehicle(dealership.getVehicleByPrice(min, max));
    }

    public void processGetByMakeModeRequest(String makeModel){
        Dealership dealership = new Dealership("John","WA","221-112-9646");
        displayVehicle(dealership.getVehicleByMakeModel(makeModel));
    }

    public void processGetByYearRequest(double min, double max){
        Dealership dealership = new Dealership("John","WA","221-112-9646");
        displayVehicle(dealership.getVehicleByYear(min,max));
    }

    public void processGetByColorRequest(String color){
        Dealership dealership = new Dealership("John","WA","221-112-9646");
        displayVehicle(dealership.getVehicleByColor(color));
    }

    public void processGetByMileageRequest(double min, double max){
        Dealership dealership = new Dealership("John","WA","221-112-9646");
        displayVehicle(dealership.getVehicleByMileAge(min, max));
    }

    public void processGetByVehicleTypeRequest(String vehicleType){
        Dealership dealership = new Dealership("john","Seattle","444-223-1111");
        displayVehicle(dealership.getVehicleByType(vehicleType));
    }

    public void processGetByAllVehicleRequest(){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        displayVehicle(dealershipFileManager.getDealership().getAllVehicle());
    }

    public void processGetByAddVehicleRequest(){
        System.out.println("Enter the VIN");
        int vin = scanner.nextInt();
        System.out.println("Enter the Year");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Make");
        String make = scanner.nextLine();
        System.out.println("Enter the Model");
        String model = scanner.nextLine();
        System.out.println("Enter the Vehicle type");
        String type = scanner.nextLine();
        System.out.println("Enter the Color");
        String color = scanner.nextLine();
        System.out.println("Enter the Odometer");
        int odometer = scanner.nextInt();
        System.out.println("Enter the Price");
        double price = scanner.nextDouble();

        Vehicle newVehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
        this.dealership.addVehicle(newVehicle);
    }

    public void processGetByRemoveVehicleRequest(){

        System.out.println("Enter the VIN");
        int vinRemove = scanner.nextInt();
        System.out.println("Enter the Year");
        int yearRemove = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Make");
        String makeRemove = scanner.nextLine();
        System.out.println("Enter the Model");
        String modelRemove = scanner.nextLine();
        System.out.println("Enter the Vehicle type");
        String typeRemove = scanner.nextLine();
        System.out.println("Enter the Color");
        String colorRemove = scanner.nextLine();
        System.out.println("Enter the Odometer");
        int odometerRemove = scanner.nextInt();
        System.out.println("Enter the Price");
        double priceRemove = scanner.nextDouble();

        Vehicle removedVehicle = new Vehicle(vinRemove,yearRemove,makeRemove,modelRemove,typeRemove,colorRemove,odometerRemove,priceRemove);
        this.dealership.remove(removedVehicle);

    }

}
