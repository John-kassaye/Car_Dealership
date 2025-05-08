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

              switch (choice) {
                  case 1:
                      processGetByPriceRequest();
                      break;
                  case 2:
                      processGetByMakeModeRequest();
                      break;
                  case 3:
                      processGetByYearRequest();
                      break;
                  case 4:
                      processGetByColorRequest();
                      break;
                  case 5:
                      processGetByMileageRequest();
                      break;
                  case 6:
                      processGetByVehicleTypeRequest();
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

    private Dealership init(){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership =  dealershipFileManager.getDealership();
        return this.dealership;
    }

    private void displayVehicle(List<Vehicle> vehicle){
        for (Vehicle vehicle1 : vehicle){
            System.out.println(vehicle1);
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


    public void processGetByPriceRequest(){}

    public void processGetByMakeModeRequest(){}

    public void processGetByYearRequest(){}

    public void processGetByColorRequest(){}

    public void processGetByMileageRequest(){}

    public void processGetByVehicleTypeRequest(){}

    public void processGetByAllVehicleRequest(){
        Dealership dealership1 = new Dealership("john","Seattle","444-223-1111");
        displayVehicle(dealership1.getAllVehicle());
    }

    public void processGetByAddVehicleRequest(){}

    public void processGetByRemoveVehicleRequest(){}

}
