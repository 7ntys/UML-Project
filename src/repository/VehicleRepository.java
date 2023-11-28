package repository;
import domain.Vehicle;
import java.util.ArrayList;
import java.util.List;
//Create interface with methods to be implemented
public class VehicleRepository {
    private List<Vehicle> ListVehicle = new ArrayList<Vehicle>();
    private static VehicleRepository instance = null;
    private VehicleRepository(){}
    public static VehicleRepository getRepository(){
        if(instance == null){
            instance = new VehicleRepository();
        }
        return instance;
    }
    //CRUDE OPERATION :
    public void addVehicle(Vehicle vehicle){
        ListVehicle.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        ListVehicle.remove(vehicle);
    }
}
