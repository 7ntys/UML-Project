package views;
import domain.Customer;
import domain.Reservation;
import domain.Vehicle;
import repository.CustomerRepository;
import factory.CustomerFactory;
import java.util.List;
import java.util.Scanner;

import static util.Util.getVehiclesByBrand;
import static util.Util.getVehiclesByName;

public class view {
    public static void display(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello welcome to Group 8 Rental Shop !\nHow can we help you ?\n" +
                "1. Search for a car by brand\n" +
                "2. Search for a car by name\n" +
                "3. Search for a car by tier\n"+
                "4. Exit");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                searchByBrand();
                break;
            case 2:
                searchByName();
                break;
            case 3:
                System.out.println("Sorry this feature is not available yet");
                break;
            case 4 :
                break;
            default:
                System.out.println("Sorry this feature is not available yet");
                break;
        }
    }
    public static void createCustomer(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name ?");
        String firstName = scan.nextLine();
        System.out.println("What is your last name ?");
        String lastName = scan.nextLine();
        System.out.println("What is your age ?");
        int age = scan.nextInt();
        System.out.println("What is your title ?");
        String title = scan.nextLine();
        System.out.println("Thank you for your registration !");
        Customer customer = CustomerFactory.getCustomer(firstName, lastName, age, Math.random()*10000+"", title);
        CustomerRepository repo = CustomerRepository.getRepository();
        repo.addCustomer(customer);
    }
    public static void authentify(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name ?");
        String firstName = scan.nextLine();
        System.out.println("What is your last name ?");
        String lastName = scan.nextLine();
        CustomerRepository repo = CustomerRepository.getRepository();
        List<Customer> customers = repo.getAllCustomers();
        for(Customer customer : customers){
            if(customer.getFirstName().equals(firstName) && customer.getLastName().equals(lastName)){
                System.out.println("Welcome back " + customer.getClientTitle() + " " + customer.getLastName());
                display();
            }
        }
        System.out.println("Sorry we don't have any customer with this name in our database");
        System.out.println("Do you want to create an account ?\n1: Yes !\n2: No thanks, take me back");
        int choice = scan.nextInt();
        if (choice == 1) {
            createCustomer();
        } else {
            display();
        }
    }
    public static void displayAuth(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have an account ?\n1: Yes !\n2: No, I need one");
        int choice = scan.nextInt();
        if (choice == 1) {
            authentify();
        } else {
            createCustomer();
        }
    }
    public static <T> void print(List<T> items){
        for(T item : items){
            System.out.println(item);
        }
    }
    public static void searchByBrand(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What brand of car are you looking for ?");
        String search = scan.nextLine();
        List<Vehicle> vehicles = getVehiclesByBrand(search);
        if(vehicles.isEmpty()) {
            System.out.println("Sorry we don't have any " + search + " in our shop");
        }else{
            System.out.println("Here are the " + search + " we have in our shop :");
            print(vehicles);
        }
        System.out.println("Do you want to rent it ?\n1: Yes !\n2: No thanks, take me back");
        int choice = scan.nextInt();
        if (choice == 1) {
            displayAuth();
        } else {
            display();
        }
        makeReservation(vehicles.get(0));

    }
    public static void searchByName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What car are you looking for ?");
        String search = scan.nextLine();
        List<Vehicle> vehicles = getVehiclesByName(search);
        if(vehicles.isEmpty()) {
            System.out.println("Sorry we don't have any " + search + " in our shop");
        }else{
            System.out.println("Here are the " + search + " we have in our shop :");
            print(vehicles);
        }
    }
    public static void makeReservation(Vehicle vehicle){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the debut date (dd-mm-yyyy) :");
        String debut = scan.nextLine();
        System.out.println("Enter the end date (dd-mm-yyyy) :");
        String end = scan.nextLine();
        Reservation reservation = new Reservation.Builder()
                .setReservationDebutDate(debut)
                .setReservationEndDate(end)
                .setReservationId(Math.random()*100000 + "")
                .build();
        vehicle.setReservation(reservation);
        System.out.println("Thank you for your reservation !");
        display();
    }
}
