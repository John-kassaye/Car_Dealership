package CarDealership;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private List<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String search(){
        return null;
    }

    public List<Vehicle> getVehicleByPrice(double min,double max){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        List<Vehicle> vehicleList= dealershipFileManager.getDealership().getAllVehicle();
        List<Vehicle> vehicleByPrice = new ArrayList<>();

        for (Vehicle vehicle : vehicleList ){
            double price = vehicle.getPrice();
            if (min <= price && price <= max){
                vehicleByPrice.add(vehicle);
            }
        }
        return vehicleByPrice;
    }

    public List<Vehicle> getVehicleByMakeModel(String makeModel){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        List<Vehicle> vehicleList = dealershipFileManager.getDealership().getAllVehicle();
        List<Vehicle> vehicleByMakeModel = new ArrayList<>();

        for (Vehicle vehicle : vehicleList){
            if (vehicle.getMake().equalsIgnoreCase(makeModel)|| vehicle.getModel().equalsIgnoreCase(makeModel)){
                vehicleByMakeModel.add(vehicle);
            }
        }
        return vehicleByMakeModel;
    }
    public List<Vehicle> getVehicleByYear(double min,double max){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        List<Vehicle> vehicleList = dealershipFileManager.getDealership().getAllVehicle();
        List<Vehicle> vehicleByYear = new ArrayList<>();

        for (Vehicle vehicle : vehicleList){
            double year = vehicle.getYear();
            if (min <= year && year <= max){
                vehicleByYear.add(vehicle);
            }
        }
        return vehicleByYear;
    }

    public List<Vehicle> getVehicleByColor(String color){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        List<Vehicle> vehicleList = dealershipFileManager.getDealership().getAllVehicle();
        List<Vehicle> vehicleByColor = new ArrayList<>();

        for (Vehicle vehicle : vehicleList){
            if (vehicle.getColor().equalsIgnoreCase(color)){
                vehicleByColor.add(vehicle);
            }
        }
        return vehicleByColor;
    }
    public List<Vehicle> getVehicleByMileAge(double min,double max){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        List<Vehicle> vehicleList = dealershipFileManager.getDealership().getAllVehicle();
        List<Vehicle> vehicleByMileAge = new ArrayList<>();

        for (Vehicle vehicle : vehicleList){
            double mileAge = vehicle.getOdometer();
            if (min <= mileAge && mileAge <= max ){
                vehicleByMileAge.add(vehicle);
            }
        }
        return vehicleByMileAge;
    }
    public List<Vehicle> getVehicleByType(String vehicleType){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        List<Vehicle> vehicleList = dealershipFileManager.getDealership().getAllVehicle();
        List<Vehicle> vehicleByType = new ArrayList<>();

        for (Vehicle vehicle : vehicleList){
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)){
                vehicleByType.add(vehicle);
            }
        }
        return vehicleByType;
    }

    public void remove(Vehicle vehicle){
//        DealershipFileManager dealershipFileManager = new DealershipFileManager();
//        List<Vehicle> vehicleList = dealershipFileManager.getDealership().getAllVehicle();
//
//        for (Vehicle vehicle1 : vehicleList){
//            if (vehicleList.contains(vehicle)){
//                vehicleList.remove(vehicle1);
//            }
//        }

    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public List<Vehicle> getAllVehicle(){
        return inventory;
    }


}
