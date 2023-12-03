package repository;

import domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> repository = new ArrayList<Customer>();
    private static CustomerRepository instance = null;
    private CustomerRepository(){
        populate();
    }
    private void populate(){
        Customer customer1 = new Customer.Builder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(25)
                .setId("1")
                .setClientTitle("Mr")
                .build();
        repository.add(customer1);
        Customer customer2 = new Customer.Builder()
                .setFirstName("Jane")
                .setLastName("Doe")
                .setAge(25)
                .setId("2")
                .setClientTitle("Mrs")
                .build();
        repository.add(customer2);
        Customer customer3 = new Customer.Builder()
                .setFirstName("Jack")
                .setLastName("Doe")
                .setAge(25)
                .setId("3")
                .setClientTitle("Mr")
                .build();
        repository.add(customer3);
    }

    public static CustomerRepository getRepository(){
        if(instance == null){
            instance = new CustomerRepository();
        }
        return instance;
    }
    //CRUDE OPERATION :
    public void addCustomer(Customer customer){
        repository.add(customer);
    }
    public void removeCustomer(Customer customer){
        repository.remove(customer);
    }
    public static List<Customer> getAllCustomers(){
        CustomerRepository repo = CustomerRepository.getRepository();
        return repo.repository;
    }
}
