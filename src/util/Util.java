package util;
import domain.Reservation;
import domain.Vehicle;

import java.util.*;

import domain.Employee;

import repository.EmployeeRepository;
import repository.VehicleRepository;
public class Util {
    public static List<Vehicle> getVehiclesByBrand(String brand,Reservation reservation){
        List<Vehicle> repo = getVehiclesAvailable(reservation);
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        for(Vehicle vehicle : repo){
            if(vehicle.getVehicleBrand().equals(brand)){
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }
    public static List<Vehicle> getVehiclesByName(String name,Reservation reservation){
        List<Vehicle> repo = getVehiclesAvailable(reservation);
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        for(Vehicle vehicle : repo){
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
    public static Set<String> getAllBrands(Reservation reservation){
        List<Vehicle> vehicles = getVehiclesAvailable(reservation);
        Set<String> brands = new HashSet<String>();
        for(Vehicle vehicle : vehicles){
            brands.add(vehicle.getVehicleBrand());
        }
        return brands;
    }
    public static Set<String> getAllNames(Reservation reservation){
        List<Vehicle> vehicles = getVehiclesAvailable(reservation);
        Set<String> names = new HashSet<String>();
        for(Vehicle vehicle : vehicles){
            names.add(vehicle.getVehicleName());
        }
        return names;
    }
    public static List<Vehicle> getVehiclesAvailable(Reservation reservation){
        VehicleRepository repo = VehicleRepository.getRepository();
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        for(Vehicle vehicle : repo.getAllVehicles()){
            if(vehicle.getReservation().isEmpty()){
                vehicles.add(vehicle);
            }
            else{
                vehicle.getReservation().forEach(reservation1 -> {
                    if(reservation1.getReservationEndDate().before(reservation.getReservationDebutDate()) || reservation1.getReservationDebutDate().after(reservation.getReservationEndDate())){
                        vehicles.add(vehicle);
                    }
                });
        }
        }
        return vehicles;
    }
}
