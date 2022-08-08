package abstraction;

abstract class Vehicle {
	
	public abstract void wheels();
	
	public void engine() {
		System.out.println("Vehicle has engine");
	}
	
	public void horn() {
		System.out.println("Vehicle has horn");
	}
	
	public void brakes() {
		System.out.println("Vehicle has brakes");
	}
}

class Bike extends Vehicle {
	
	public void wheels() {
		System.out.println("Bike has 2 wheels");
	}
	
	public void helmet() {
		System.out.println("Helmet is mandatory to ride bike");
	}
}

class Car extends Vehicle {
	
	public void wheels() {
		System.out.println("Car has 4 wheels");
	}
	
	public void seatBelt() {
		System.out.println("Seat-belt is mandatory to drive car");
	}
	
	public void roof() {
		System.out.println("Car has roof");
	}
}

public class Main_N1 {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Bike();
		Bike bike = new Bike();
		Vehicle vehicle2 = new Car();
		Car car = new Car();
		
		vehicle1.engine();
		vehicle1.horn();
		vehicle1.brakes();
		vehicle1.wheels();
		
		System.out.println("-------------------------");
		
		vehicle2.engine();
		vehicle2.horn();
		vehicle2.brakes();
		vehicle2.wheels();
		
		System.out.println("-------------------------");
		
		bike.engine();
		bike.horn();
		bike.brakes();
		bike.wheels();
		bike.helmet();
		
		System.out.println("--------------------------");
		
		car.engine();
		car.horn();
		car.brakes();
		car.wheels();
		car.seatBelt();
		car.roof();
	}
}
