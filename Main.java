import java.util.Scanner;
//Car class
class Car{
    String vehicleNumber;
    String brand;
    int rentPerDay;
    //Constructor
    Car(String vehicleNumber, String brand, int rentPerDay){
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }
    //Method to calculate rent
    int calculateRent(int days){
        return rentPerDay * days;
    }
}
//Bike class
class Bike{
    String vehicleNumber;
    String brand;
    int rentPerDay;
    //Constructor
    Bike(String vehicleNumber, String brand, int rentPerDay){
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }
    //Method to calculate rent
    int calculateRent(int days){
        return rentPerDay * days;
    }
}

//Main class
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        //Creating objects
        Car c1 = new Car(vehicleNumber: "C101", brand: "Toyota", rentPerDay: 1000);
        Bike b1 = new Bike(vehicleNumber: "B101", brand: "Honda", rentPerDay: 300);
        System.out.println("Car Rent for "+ days + " days: " + c1.calculateRent(days));
        System.out.println("Bike Rent for "+ days + " days: " + b1.calculateRent(days));
    }
}
        
