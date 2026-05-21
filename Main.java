import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //Parent class references
        //Polymorphism
        Vehicle v1 = new Car("CG 04 AB 1023", "Toyota Corolla", 2500);
        Vehicle v2 = new Bike("CG 04 MN 4455", "Royal Enfield", 1800);

        System.out.println("Enter no. of days you want to rent Bike or Car: ");
        int days = sc.nextInt();
        System.out.println("Car Rent for 3 days: " + v1.calculateRent(days));
        System.out.println("Bike Rent for 3 days: " + v2.calculateRent(days));
    }
}
class Vehicle {
    String vehicleNumber;
    String brand;
    int rentPerDay;

    //Constructor
    Vehicle(String vehicleNumber, String brand, int rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    //Method to calculate rent
    int calculateRent(int days) {
        return rentPerDay * days;
    }
}
class Car extends Vehicle {

    //Constructor
    Car(String vehicleNumber, String brand, int rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    //Overriding method
    int calculateRent(int days) {
        return rentPerDay * days;
    }
}
class Bike extends Vehicle {

    //Constructor
    Bike(String vehicleNumber, String brand, int rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    //Overriding method
    int calculateRent(int days) {
        return rentPerDay * days;
    }
}
