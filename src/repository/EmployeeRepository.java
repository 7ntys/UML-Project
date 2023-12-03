package repository;
import java.util.*;
import domain.Employee;
import factory.EmployeeFactory;  
public class EmployeeRepository {
    private List<Employee> repository = new ArrayList<>();
    private static EmployeeRepository instance = null;
    private EmployeeRepository(){populate();}
    public static EmployeeRepository getInstance(){
        if (instance == null){instance = new EmployeeRepository();}
        return instance;
    }
    public void populate(){
        Employee emp1 = EmployeeFactory.getEmployee("Julien", "Le Ber", 20, "1", 0, "Intern","Hey, Julien here to serve you !");
        repository.add(emp1);
        Employee emp2 = EmployeeFactory.getEmployee("Ryan","Schmidt",25,"2",1200,"Employee","Yooooooo man how can i help you ride ?");
        repository.add(emp2);
        Employee emp3 = EmployeeFactory.getEmployee("Manuel","De la Sierra",40,"3",2400,"Manager","Hi ! How is it ? Let me shw you all of our best vehicles !");
        repository.add(emp3);
        Employee emp4 = EmployeeFactory.getEmployee("Dylan","Bagnole",18,"3",1000,"Employee","Yo my G, wanna get a real man's car ?");
        repository.add(emp4);
    }
    public List<Employee> getAllEmployees(){
        return this.repository;
    }
}
