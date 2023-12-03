package util;
import domain.Vehicle;
import java.util.ArrayList;
import domain.Employee;
import java.util.List;

import repository.EmployeeRepository;
import repository.VehicleRepository;
public class Util {
    public static List<Vehicle> getVehiclesByBrand(String brand){
        VehicleRepository repo = VehicleRepository.getRepository();
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        for(Vehicle vehicle : repo.getAllVehicles()){
            if(vehicle.getVehicleBrand().equals(brand) && vehicle.getReservation() == null){
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }
    public static List<Vehicle> getVehiclesByName(String name){
        VehicleRepository repo = VehicleRepository.getRepository();
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        for(Vehicle vehicle : repo.getAllVehicles()){
            if(vehicle.getVehicleName().equals(name)){
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }
    public static Employee getRandomEmployee(){
        EmployeeRepository repo = EmployeeRepository.getInstance();
        List<Employee> employees = repo.getAllEmployees();
        int random = (int) (Math.random() * employees.size());
        return employees.get(random);
    }
}
