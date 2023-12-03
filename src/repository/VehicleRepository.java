package repository;
import domain.Vehicle;
import java.util.ArrayList;
import java.util.List;
//Create interface with methods to be implemented
public class VehicleRepository {
    private List<Vehicle> repository = new ArrayList<Vehicle>();
    private static VehicleRepository instance = null;
    private VehicleRepository(){
        //Populate the List:
        populate();

    }
    public static VehicleRepository getRepository(){
        if(instance == null){
            instance = new VehicleRepository();
        }
        return instance;
    }
    //CRUDE OPERATION :
    public void addVehicle(Vehicle vehicle){
        repository.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        repository.remove(vehicle);
    }
    public void populate(){
        Vehicle vehicle1 = new Vehicle.Builder()
                .setVehicleName("A3")
                .setVehicleBrand("Audi")
                .setVehicleImmatriculation("CYY-42205")
                .setVehicleYearCreation(2023)
                .setVehicleKMCounter(0.0)
                .build();
        repository.add(vehicle1);
        Vehicle vehicle2 = new Vehicle.Builder()
                .setVehicleName("A4")
                .setVehicleBrand("Audi")
                .setVehicleImmatriculation("CYY-98206")
                .setVehicleYearCreation(2020)
                .setVehicleKMCounter(100.0)
                .build();
        repository.add(vehicle2);
        Vehicle vehicle3 = new Vehicle.Builder()
                .setVehicleName("600")
                .setVehicleBrand("Mercedes")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(1990)
                .setVehicleKMCounter(250.0)
                .build();
        repository.add(vehicle3);
        //Miata :
        Vehicle vehicle4 = new Vehicle.Builder()
                .setVehicleName("Miata")
                .setVehicleBrand("Mazda")
                .setVehicleImmatriculation("CYY-42205")
                .setVehicleYearCreation(2023)
                .setVehicleKMCounter(0.0)
                .build();
        repository.add(vehicle4);
        //Clio :
        Vehicle vehicle5 = new Vehicle.Builder()
                .setVehicleName("Clio")
                .setVehicleBrand("Renault")
                .setVehicleImmatriculation("CYY-98206")
                .setVehicleYearCreation(2020)
                .setVehicleKMCounter(100.0)
                .build();
        repository.add(vehicle5);
        //Ferrari :
        Vehicle vehicle6 = new Vehicle.Builder()
                .setVehicleName("Enzo")
                .setVehicleBrand("Ferrari")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(2002)
                .setVehicleKMCounter(50.0)
                .build();
        repository.add(vehicle6);
        //Porsche :
        Vehicle vehicle7 = new Vehicle.Builder()
                .setVehicleName("Carrera")
                .setVehicleBrand("Porsche")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(1980)
                .setVehicleKMCounter(100.0)
                .build();
        repository.add(vehicle7);
        //Porsche 911 :
        Vehicle vehicle8 = new Vehicle.Builder()
                .setVehicleName("911")
                .setVehicleBrand("Porsche")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(2010)
                .setVehicleKMCounter(150.0)
                .build();
        repository.add(vehicle8);
        //Lamborghini :
        Vehicle vehicle9 = new Vehicle.Builder()
                .setVehicleName("Aventador")
                .setVehicleBrand("Lamborghini")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(2015)
                .setVehicleKMCounter(200.0)
                .build();
        repository.add(vehicle9);
        //Tesla :
        Vehicle vehicle10 = new Vehicle.Builder()
                .setVehicleName("Model S")
                .setVehicleBrand("Tesla")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(2018)
                .setVehicleKMCounter(250.0)
                .build();
        repository.add(vehicle10);
        //Nissan 350Z :
        Vehicle vehicle11 = new Vehicle.Builder()
                .setVehicleName("350Z")
                .setVehicleBrand("Nissan")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(2005)
                .setVehicleKMCounter(300.0)
                .build();
        repository.add(vehicle11);
        //Nissan GTR :
        Vehicle vehicle12 = new Vehicle.Builder()
                .setVehicleName("GTR")
                .setVehicleBrand("Nissan")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(2015)
                .setVehicleKMCounter(350.0)
                .build();
        repository.add(vehicle12);
        //ALfa romeo :
        Vehicle vehicle13 = new Vehicle.Builder()
                .setVehicleName("Giulia")
                .setVehicleBrand("Alfa Romeo")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(2018)
                .setVehicleKMCounter(400.0)
                .build();
        repository.add(vehicle13);
        //BMW :
        Vehicle vehicle14 = new Vehicle.Builder()
                .setVehicleName("M3")
                .setVehicleBrand("BMW")
                .setVehicleImmatriculation("CYY-42905")
                .setVehicleYearCreation(2015)
                .setVehicleKMCounter(450.0)
                .build();
        repository.add(vehicle14);


    }
    public List<Vehicle> getAllVehicles(){
        return repository;
    }
}
