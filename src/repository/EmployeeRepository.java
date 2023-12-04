package repository;

import java.util.*;
import domain.Employee;
import factory.EmployeeFactory;

public class EmployeeRepository implements IRepository<Employee, String>{
    private List<Employee> repository = new ArrayList<>();
    private static EmployeeRepository instance = null;

    private EmployeeRepository() {
        populate();
    }

    public static EmployeeRepository getInstance() {
        if (instance == null) {
            instance = new EmployeeRepository();
        }
        return instance;
    }

    public void populate() {
        Employee emp1 = EmployeeFactory.getEmployee("Julien", "Le Ber", 20, "1", 0, "Intern",
                "Hey, nice to meet you i'm Julien here to serve you !");
        create(emp1);
        Employee emp2 = EmployeeFactory.getEmployee("Ryan", "Schmidt", 25, "2", 1200, "Employee",
                "Yooooooo man i'm Ryan how can i help you ride ?");
        create(emp2);
        Employee emp3 = EmployeeFactory.getEmployee("Manuel", "De la Sierra", 40, "3", 2400, "Manager",
                "Hi ! How is it ? 'm Manuel Let me show you all of our best vehicles !");
        create(emp3);
        Employee emp4 = EmployeeFactory.getEmployee("Dylan", "Bagnole", 18, "3", 1000, "Employee",
                "Yo my G, I'm Dylan wanna get a real man's car ?");
        create(emp4);
        Employee emp5 = EmployeeFactory.getEmployee("Mathieu", "Roche", 20, "4", 1, "Employee",
                "Always a pleasure to have business, I'm Mathieu, how can i help you ?");
        create(emp5);
        Employee emp6 = EmployeeFactory.getEmployee("Damien", "Stheneur", 20, "5", 1, "Employee",
                "Business is business, I'm Damien, best deal in town !");
        create(emp6);
        Employee emp7 = EmployeeFactory.getEmployee("Jerome", "Niel", 20, "5", 1, "Employee",
                "Always here to help, I'm Jerome, what can i do for you ?");
        create(emp7);
    }

    public List<Employee> getAllEmployees() {
        return this.repository;
    }

    @Override
    public void create(Employee employee) {
        repository.add(employee);
    }

    @Override
    public Employee read(String s) {
        for (Employee employee : repository) {
            if (employee.getId() == s) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void update(Employee employee) {
        for (Employee employee1 : repository) {
            if (employee1.getId() == employee.getId()) {
                repository.remove(employee1);
                repository.add(employee);
            }
        }
    }

    @Override
    public boolean delete(String s) {
        for (Employee employee : repository) {
            if (employee.getId() == s) {
                repository.remove(employee);
                return true;
            }
        }
        return false;
    }
}
