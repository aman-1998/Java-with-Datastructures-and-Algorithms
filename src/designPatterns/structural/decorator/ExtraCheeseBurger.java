package designPatterns.structural.decorator;

public class ExtraCheeseBurger implements BurgerDecorator {
	
	private Burger burger;
	
	public ExtraCheeseBurger(Burger burger) {
		this.burger = burger;
	}

	@Override
	public String getDescripton() {
		return burger.getDescripton() + " with extra cheese";
	}

	@Override
	public double getCost() {
		return burger.getCost() + 20.0;
	}
	
}
