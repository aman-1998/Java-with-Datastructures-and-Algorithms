package designPatterns.structural.decorator;

/*
 * Usage:-
 * When you want to add extra functionality into the object
 * then you use Decorator design pattern.
 * 
 * Adv:-
 * We just need to make classes for each topings and not for the
 * combination of topings like ExtraMayoneseAndCheeseBurger, etc
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Burger burger = new VegBurger();
		System.out.println(burger.getDescripton());
		System.out.println(burger.getCost());
		
		burger = new ExtraCheeseBurger(burger);
		System.out.println(burger.getDescripton());
		System.out.println(burger.getCost());
		
		burger = new ExtraMayoBurger(burger);
		System.out.println(burger.getDescripton());
		System.out.println(burger.getCost());
	}
}
