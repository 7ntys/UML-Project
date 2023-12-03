package factory;
import domain.Vehicle;

public class VehicleFactory{
    public static Vehicle getVehicle(String VehicleName, String VehicleBrand,String VehicleImmatriculation, int VehicleYearCreation, double VehicleKMCounter){
        return new Vehicle.Builder()
                .setVehicleName(VehicleName)
                .setVehicleBrand(VehicleBrand)
                .setVehicleImmatriculation(VehicleImmatriculation)
                .setVehicleYearCreation(VehicleYearCreation)
                .setVehicleKMCounter(VehicleKMCounter)
                .build();
    }
}