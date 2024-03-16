package designPatterns.creational.abstractFactory;

public class BikeFactory extends AutomobileFactory {

	@Override
	public Vehicle deliver(String purpose) {
		
		if(purpose.equals("Sports")) {
			return new RaceBike();
		} else if(purpose.equals("Road-Presence")) {
			return new RetroBike();
		}
		
		return null;
	}
	
	
}
