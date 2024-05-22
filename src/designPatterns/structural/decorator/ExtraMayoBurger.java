package designPatterns.structural.decorator;

public class ExtraMayoBurger implements BurgerDecorator {
	
	private Burger burger;
	
	public ExtraMayoBurger(Burger burger) {
		this.burger = burger;
	}

	@Override
	public String getDescripton() {
		return burger.getDescripton() + " with extra mayonese";
	}

	@Override
	public double getCost() {
		return burger.getCost() + 15.0;
	}

}
