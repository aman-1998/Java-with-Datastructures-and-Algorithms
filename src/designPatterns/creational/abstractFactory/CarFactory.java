package designPatterns.creational.abstractFactory;

public class CarFactory extends AutomobileFactory {

	@Override
	public Vehicle deliver(String purpose) {

		if(purpose.equals("Luxary")) {
			return new Sedan();
		} else if(purpose.equals("Off-Roading")) {
			return new SUV();
		} else if(purpose.equals("Budget")) {
			return new HatchBack();
		}
		
		return null;
	}

}
