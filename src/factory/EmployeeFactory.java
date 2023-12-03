package factory;
import domain.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String firstName, String lastName, int age, String id, double salary, String jobTitle,String catchPhrase){
        return new Employee.Builder()
                .setCatchPhrase(catchPhrase)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setId(id)
                .setSalary(salary)
                .setJobTitle(jobTitle)
                .build();
    }
}
