import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    String vehicleNumber;
    String brand;
    int rentPerDay;

    // Constructor
    Vehicle(String vehicleNumber, String brand, int rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    // Method to calculate rent
    int calculateRent(int days) {
        return rentPerDay * days;
    }
}

// Subclass Car
class Car extends Vehicle {

    Car(String vehicleNumber, String brand, int rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    int calculateRent(int days) {
        return rentPerDay * days;
    }
}

// Subclass Bike
class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand, int rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    int calculateRent(int days) {
        return rentPerDay * days;
    }
}

// Main class
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        // Creating objects using polymorphism
        Vehicle v1 = new Car("C101", "Toyota", 1000);
        Vehicle v2 = new Bike("B101", "Honda", 300);

        // Output (same format)
        System.out.println("Car Rent for " + days + " days: " + v1.calculateRent(days));
        System.out.println("Bike Rent for " + days + " days: " + v2.calculateRent(days));

        sc.close();
    }
}