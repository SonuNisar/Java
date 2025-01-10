package lab66;

class Vehicle {
     public void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    @Override
   public  void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    @Override
   public  void start() {
        System.out.println("Motorcycle started.");
    }
}
class Garage {
    public void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}
    
public class MmainVehi {

	public static void main(String[] args) {
		
		 Car car = new Car();
	     Motorcycle motorcycle = new Motorcycle();
	     Garage garage = new Garage();

	     garage.serviceVehicle(car);
	     garage.serviceVehicle(motorcycle);
}
}

