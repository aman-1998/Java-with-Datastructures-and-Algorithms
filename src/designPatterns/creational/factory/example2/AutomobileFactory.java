package designPatterns.creational.factory.example2;

public class AutomobileFactory {
	
	public static Vehicle getVehicle(int wheels) {
		
		switch(wheels) {
			case 2 :
				return new Bike();
			case 3 :
				return new AutoRikshaw();
			case 4 :
				return new Car();
			case 5 :
				return new Truck();
			default :
				return null;
		}
	}
}
