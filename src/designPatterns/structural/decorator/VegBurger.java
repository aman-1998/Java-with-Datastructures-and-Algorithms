package designPatterns.structural.decorator;

public class VegBurger implements Burger {

	@Override
	public String getDescripton() {
		return "Veg Burger";
	}

	@Override
	public double getCost() {
		return 180.0;
	}
	
	
}
