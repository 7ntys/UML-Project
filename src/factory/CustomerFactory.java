package factory;
import domain.Customer;
public class CustomerFactory {
    public static Customer getCustomer(String firstName, String lastName, int age, int id, String clientTitle){
        return new Customer.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setId(id)
                .setClientTitle(clientTitle)
                .build();
    }
}
