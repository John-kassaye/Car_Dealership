package CarDealership;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {
    static File file = new File("inventory.csv");
    public Dealership getDealership() {

        Dealership dealership = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String[] dealerString = bufferedReader.readLine().split("\\|");
            dealership = new Dealership(dealerString[0], dealerString[1], dealerString[2]);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split("\\|");
                int vin = Integer.parseInt(split[0]);
                int year = Integer.parseInt(split[1]);
                String make = split[2];
                String model = split[3];
                String vehicleType = split[4];
                String color = split[5];
                int odometer = Integer.parseInt(split[6]);
                double price = Double.parseDouble(split[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }

    public static void saveDealership(Dealership dealership ){

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))){
            bufferedWriter.write(dealership.toString());
            bufferedWriter.newLine();
            for (Vehicle vehicle : dealership.getAllVehicle()){
                bufferedWriter.write(vehicle.saveFormat());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
