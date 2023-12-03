package repository;
import domain.Vehicle;
import factory.VehicleFactory;

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
        //Audi :
        Vehicle vehicle1 =  VehicleFactory.getVehicle("A3","Audi","CYY-42205",2023,0.0);
        repository.add(vehicle1);
        Vehicle vehicle2 = VehicleFactory.getVehicle("A4","Audi","CYY-42905",2020,100.0);
        //Mercedes :
        repository.add(vehicle2);
        Vehicle vehicle3 = VehicleFactory.getVehicle("A5","Audi","CYY-98206",2018,200.0);
        repository.add(vehicle3);
        //Miata :
        Vehicle vehicle4 = VehicleFactory.getVehicle("Miata","Mazda","CYY-42905",2015,300.0);
        repository.add(vehicle4);
        //Clio :
        Vehicle vehicle5 = VehicleFactory.getVehicle("Clio","Renault","CYY-42905",2010,400.0);
        repository.add(vehicle5);
        //Ferrari :
        Vehicle vehicle6 = VehicleFactory.getVehicle("F40","Ferrari","CYY-42905",2005,500.0);
        repository.add(vehicle6);
        //Porsche :
        Vehicle vehicle7 = VehicleFactory.getVehicle("Carrera","Porsche","CYY-42905",2000,600.0);
        repository.add(vehicle7);
        //Porsche 911 :
        Vehicle vehicle8 = VehicleFactory.getVehicle("911","Porsche","CYY-42905",2015,700.0);
        repository.add(vehicle8);
        //Lamborghini :
        Vehicle vehicle9 = VehicleFactory.getVehicle("Huracan","Lamborghini","CYY-42905",2018,800.0);
        repository.add(vehicle9);
        //Tesla :
        Vehicle vehicle10 = VehicleFactory.getVehicle("Model S","Tesla","CYY-42905",2019,900.0);
        repository.add(vehicle10);
        //Nissan 350Z :
        Vehicle vehicle11 = VehicleFactory.getVehicle("350Z","Nissan","CYY-42905",2015,1000.0);
        repository.add(vehicle11);
        //Nissan GTR :
        Vehicle vehicle12 = VehicleFactory.getVehicle("GTR","Nissan","CYY-42905",2018,1100.0);
        repository.add(vehicle12);
        //ALfa romeo :
        Vehicle vehicle13 = VehicleFactory.getVehicle("Giulia","Alfa Romeo","CYY-42905",2015,1200.0);
        repository.add(vehicle13);
        //BMW :
        Vehicle vehicle14 = VehicleFactory.getVehicle("M3","BMW","CYY-42905",2018,1300.0);
        repository.add(vehicle14);


    }
    public List<Vehicle> getAllVehicles(){
        return repository;
    }
}
