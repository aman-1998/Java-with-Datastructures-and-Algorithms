package designPatterns.structural.decorator;

public class ChickenBurger implements Burger {

	@Override
	public String getDescripton() {
		return "Chicken Burger";
	}

	@Override
	public double getCost() {
		return 210.0;
	}
}
