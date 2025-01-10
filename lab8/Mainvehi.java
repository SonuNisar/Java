package lab8;

class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }
    public void drive() {
        System.out.println("The vehicle is driving.");
    }
}
class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}
class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class Mainvehi {

	public static void main(String[] args) {
		
		        Car car = new Car("Mercedes", "Benz-G Class", 2023, 220);
		        Bike bike = new Bike("Honda", "Dio", 2023, 120);
		        
		        System.out.println("Car Details:");
		        System.out.println("Make: " + car.make + "\nModel: " + car.model + "\nYear: " + car.year + "\nMaximum Speed: " + car.maximumSpeed);
		        car.drive();

		        System.out.println("\nBike Details:");
		        System.out.println("Make: " + bike.make + "\nModel: " + bike.model + "\nYear: " + bike.year + "\nMaximum Speed: " + bike.maximumSpeed);
		        bike.drive();
	}
}
