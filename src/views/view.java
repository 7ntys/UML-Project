package views;

import domain.Customer;
import domain.Reservation;
import domain.Employee;
import util.Util;
import domain.Vehicle;
import repository.CustomerRepository;
import factory.CustomerFactory;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static util.Util.getVehiclesByBrand;
import static util.Util.getVehiclesByName;

public class view {
    public static void display(Reservation reservation) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n" +
                "1. Search for a car by brand\n" +
                "2. Search for a car by name\n" +
                "3. Change Date of reservation\n" +
                "4. Exit");
        int choice = scan.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        switch (choice) {
            case 1:
                searchByBrand(reservation);
                break;
            case 2:
                searchByName(reservation);
                break;
            case 3:
                enterPoint();
                break;
            case 4:
                System.out.println("Thank you for your visit !");
                return;
            default:
                System.out.println("Sorry this feature is not available yet");
                break;
        }
    }

    public static void createCustomer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name ?");
        String firstName = scan.nextLine();
        System.out.println("What is your last name ?");
        String lastName = scan.nextLine();
        System.out.println("What is your age ?");
        int age = Integer.parseInt(scan.nextLine());
        System.out.println("What is your title ?");
        String title = scan.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Thank you for your registration !");
        Customer customer = CustomerFactory.getCustomer(firstName, lastName, age, Math.random() * 10000 + "", title);
        CustomerRepository repo = CustomerRepository.getRepository();
        repo.create(customer);
    }

    public static void authentify() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name ?");
        String firstName = scan.nextLine();
        System.out.println("What is your last name ?");
        String lastName = scan.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        List<Customer> customers = CustomerRepository.getAllCustomers();
        for (Customer customer : customers) {
            if (customer.getFirstName().equals(firstName) && customer.getLastName().equals(lastName)) {
                System.out.println("Welcome back " + customer.getClientTitle() + " " + customer.getLastName());
                return;
            }
        }
        System.out.println("Sorry we don't have any customer with this name in our database");
        displayAuth();
    }

    public static void displayAuth() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have an account ?\n1: Yes !\n2: No, I need one");
        int choice = scan.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        if (choice == 1) {
            authentify();
        } else {
            createCustomer();
        }
    }

    public static <T> void print(List<T> items) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + 1 + " : " + items.get(i));
        }
    }

    public static void searchByBrand(Reservation reservation) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What brand of car are you looking for ?\nWe have : " + Util.getAllBrands(reservation));
        String search = scan.nextLine();
        List<Vehicle> vehicles = getVehiclesByBrand(search, reservation);
        if (vehicles.isEmpty()) {
            System.out.println("Sorry we don't have any " + search + " in our shop available for this period of time");
        } else {
            System.out.println("Here are the " + search + " available in our shop :");
            print(vehicles);
        }
        System.out.println(vehicles.size() + 1 + " : " + "Take me back");
        int choice = scan.nextInt();
        if (choice < vehicles.size() + 1) {
            displayAuth();
            vehicles.get(choice - 1).addReservation(reservation);
            System.out.println("Thank you For your reservation\nAnything Else ?");
            display(reservation);
        } else {
            display(reservation);
        }
    }

    public static void searchByName(Reservation reservation) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What car are you looking for ?\nWe have : " + Util.getAllNames(reservation));
        String search = scan.nextLine();
        List<Vehicle> vehicles = getVehiclesByName(search, reservation);
        if (vehicles.isEmpty()) {
            System.out.println("Sorry we don't have any " + search + " in our shop for this period of time");
        } else {
            System.out.println("Here are the " + search + " we have in our shop :");
            print(vehicles);
        }
        System.out.println(vehicles.size() + 1 + " : " + "Take me back");
        int choice = scan.nextInt();
        if (choice < vehicles.size() + 1) {
            displayAuth();
            vehicles.get(choice - 1).addReservation(reservation);
            System.out.println("Thank you For your reservation\nAnything Else ?");
            display(reservation);
        } else {
            display(reservation);
        }
    }

    public static Reservation makeReservation() {
        Date debut = enterDate();
        System.out.println("Enter the end date (dd-mm-yyyy) :");
        Date end = enterDate();
        Reservation reservation = new Reservation.Builder()
                .setReservationDebutDate(debut)
                .setReservationEndDate(end)
                .setReservationId(Math.random() * 100000 + "")
                .build();
        return reservation;
    }

    public static Date enterDate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day : ");
        String day = scan.nextLine();
        System.out.println("Enter the month : ");
        String month = scan.nextLine();
        System.out.println("Enter the year : ");
        String year = scan.nextLine();
        Date date = new Date(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return date;
    }

    public static void enterPoint() {
        Employee employe = Util.getRandomEmployee();
        System.out.println(employe.getCatchPhrase());
        System.out.println("Enter the date of your future reservation :");
        Reservation reservation = makeReservation();
        display(reservation);
    }
}
