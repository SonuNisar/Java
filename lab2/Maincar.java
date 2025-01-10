package lab2;

import java.util.Scanner;

class Car {
    
    String make;
    String model;
    short year;
    int price;

    Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: $" + price);
    }
}

public class Maincar {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter car details:");
		        
		        System.out.print("Make: ");
		        String make = scanner.nextLine();
		        
		        System.out.print("Model: ");
		        String model = scanner.nextLine();
		        
		        System.out.print("Year: ");
		        short year = scanner.nextShort();
		        
		        System.out.print("Price: ");
		        int price = scanner.nextInt();

		        Car car = new Car(make, model, year, price);
		        System.out.println("\nCar Details:");
		        car.displayDetails();

		        scanner.close();
		    }

	}


