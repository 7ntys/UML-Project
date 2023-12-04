package repository;
import domain.Vehicle;
import factory.VehicleFactory;

import java.util.ArrayList;
import java.util.List;
//Create interface with methods to be implemented
public class VehicleRepository implements IRepository<Vehicle,String>{
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
    public void create(Vehicle vehicle){
        repository.add(vehicle);
    }
    public boolean delete(String Id){
        for(Vehicle vehicle : repository){
            if (vehicle.getVehicleName() == Id){
                repository.remove(vehicle);
                return true;
            }
        }
        return false;
    }

    @Override
    public Vehicle read(String s) {
        for (Vehicle vehicle : repository){
            if (vehicle.getVehicleName() == s){
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public void update(Vehicle vehicle) {
        for (Vehicle vehicle1 : repository){
            if (vehicle1.getVehicleName() == vehicle.getVehicleName()){
                repository.remove(vehicle1);
                repository.add(vehicle);
            }
        }
    }

    public void populate(){
        //Audi :
        Vehicle vehicle1 =  VehicleFactory.getVehicle("A3","Audi","CYY-42205",2023,0.0);
        create(vehicle1);
        Vehicle vehicle2 = VehicleFactory.getVehicle("A4","Audi","CYY-42905",2020,100.0);
        //Mercedes :
        create(vehicle2);
        Vehicle vehicle3 = VehicleFactory.getVehicle("A5","Audi","CYY-98206",2018,200.0);
        create(vehicle3);
        //Miata :
        Vehicle vehicle4 = VehicleFactory.getVehicle("Miata","Mazda","CYY-42905",2015,300.0);
        create(vehicle4);
        //Clio :
        Vehicle vehicle5 = VehicleFactory.getVehicle("Clio","Renault","CYY-42905",2010,400.0);
        create(vehicle5);
        //Ferrari :
        Vehicle vehicle6 = VehicleFactory.getVehicle("F40","Ferrari","CYY-42905",2005,500.0);
        create(vehicle6);
        //Porsche :
        Vehicle vehicle7 = VehicleFactory.getVehicle("Carrera","Porsche","CYY-42905",2000,600.0);
        create(vehicle7);
        //Porsche 911 :
        Vehicle vehicle8 = VehicleFactory.getVehicle("911","Porsche","CYY-42905",2015,700.0);
        create(vehicle8);
        //Lamborghini :
        Vehicle vehicle9 = VehicleFactory.getVehicle("Huracan","Lamborghini","CYY-42905",2018,800.0);
        create(vehicle9);
        //Tesla :
        Vehicle vehicle10 = VehicleFactory.getVehicle("Model S","Tesla","CYY-42905",2019,900.0);
        create(vehicle10);
        //Nissan 350Z :
        Vehicle vehicle11 = VehicleFactory.getVehicle("350Z","Nissan","CYY-42905",2015,1000.0);
        create(vehicle11);
        //Nissan GTR :
        Vehicle vehicle12 = VehicleFactory.getVehicle("GTR","Nissan","CYY-42905",2018,1100.0);
        create(vehicle12);
        //ALfa romeo :
        Vehicle vehicle13 = VehicleFactory.getVehicle("Giulia","Alfa Romeo","CYY-42905",2015,1200.0);
        create(vehicle13);
        //BMW :
        Vehicle vehicle14 = VehicleFactory.getVehicle("M3","BMW","CYY-42905",2018,1300.0);
        create(vehicle14);


    }
    public List<Vehicle> getAllVehicles(){
        return repository;
    }
}
