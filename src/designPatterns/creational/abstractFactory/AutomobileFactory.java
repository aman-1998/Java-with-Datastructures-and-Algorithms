package designPatterns.creational.abstractFactory;

public abstract class AutomobileFactory {
	
	public static AutomobileFactory getFactory(int wheels) {
		
		if(wheels == 2) {
			return new BikeFactory();
		} else if(wheels == 4) {
			return new CarFactory();
		}
		
		return null;
	}
	
	public abstract Vehicle deliver(String purpose);
}
