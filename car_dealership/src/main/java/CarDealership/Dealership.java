package CarDealership;

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
        return null;
    }
    public List<Vehicle> getVehicleByMakeModel(String make,String model){
        return null;
    }
    public List<Vehicle> getVehicleByYear(double min,double max){
        return null;
    }

    public List<Vehicle> getVehicleByColor(String color){
        return null;
    }
    public List<Vehicle> getVehicleByMileAge(double min,double max){
        return null;
    }
    public List<Vehicle> getVehicleByType(String vehicleType){
        return null;
    }

    public void remove(){}

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public List<Vehicle> getAllVehicle(){
        return inventory;
    }


}
