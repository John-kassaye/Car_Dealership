package CarDealership;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {
    static String file = "inventory.csv";
    public Dealership getDealership(){
        Dealership dealership = new Dealership("honda","33rd ave","233-111-2243");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            bufferedReader.readLine();

            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] split = line.split("\\|");
                int vin = Integer.parseInt(split[0]);
                int year = Integer.parseInt(split[1]);
                String make = split[2];
                String model = split[3];
                String vehicleType = split[4];
                String color = split[5];
                int odometer = Integer.parseInt(split[6]);
                double price = Double.parseDouble(split[7]);

                Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                dealership.addVehicle(vehicle);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership){

    }

}
