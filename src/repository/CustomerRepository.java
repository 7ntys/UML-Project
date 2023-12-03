package repository;

import domain.Customer;
import factory.CustomerFactory;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> repository = new ArrayList<Customer>();
    private static CustomerRepository instance = null;
    private CustomerRepository(){
        populate();
    }
    private void populate(){
        Customer customer1 = CustomerFactory.getCustomer("John","Doe",25,"1","Mr");
        repository.add(customer1);
        Customer customer2 = CustomerFactory.getCustomer("Julien","Le Ber",20,"2","Mr");
        repository.add(customer2);
        Customer customer3 = CustomerFactory.getCustomer("Cedric","Doumbe",23,"3","Mr");
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
