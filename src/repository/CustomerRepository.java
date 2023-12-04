package repository;

import domain.Customer;
import factory.CustomerFactory;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements IRepository<Customer,String> {
    private List<Customer> repository = new ArrayList<Customer>();
    private static CustomerRepository instance = null;
    private CustomerRepository(){
        populate();
    }
    private void populate(){
        Customer customer1 = CustomerFactory.getCustomer("John","Doe",25,"1","Mr");
        create(customer1);
        Customer customer2 = CustomerFactory.getCustomer("Julien","Le Ber",20,"2","Mr");
        create(customer2);
        Customer customer3 = CustomerFactory.getCustomer("Cedric","Doumbe",23,"3","Mr");
        create(customer3);
    }

    public static CustomerRepository getRepository(){
        if(instance == null){
            instance = new CustomerRepository();
        }
        return instance;
    }
    //CRUDE OPERATION :
    public static List<Customer> getAllCustomers(){
        CustomerRepository repo = CustomerRepository.getRepository();
        return repo.repository;
    }

    @Override
    public void create(Customer customer) {
        repository.add(customer);
    }

    @Override
    public Customer read(String s) {
        for (Customer customer : repository){
            if (customer.getId() == s){
                return customer;
            }
        }
        return null;
    }

    @Override
    public void update(Customer customer) {
        for (Customer customer1 : repository){
            if (customer1.getId() == customer.getId()){
                repository.remove(customer1);
                repository.add(customer);
            }
        }
    }

    @Override
    public boolean delete(String s) {
        for (Customer customer : repository){
            if (customer.getId() == s){
                repository.remove(customer);
                return true;
            }
        }
        return false;
    }
}
