package designPatterns.creational.factory.example2;

/*
 * Pros:
 * 1. Provides abstraction
 * 2. Hides complexity of creation of object
 * 
 * 
 * Disadvantage:
 * 1. Code refactoring is difficult. For example in case we have to 
 * add new properties in Vehicle interface. We have to change all 
 * child classes.
 * 2. It is used by keeping in mind future aspects. So that we don't 
 * have to refactor code in future. So, thinking about future is 
 * quite difficult at times.
 * 
 * 
 * Usage: 
 * 1. Used in making framework and libraries
 * 2. SessionFactory in Hibernate
 * 
 * When to use it:
 * 1. If we want to create different objects of similar type but different properties.
 * 2. We want to hide the complex process of creation of objects.
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		Vehicle vehicle1 = AutomobileFactory.getVehicle(4);
		Vehicle vehicle2 = AutomobileFactory.getVehicle(3);
		Vehicle vehicle3 = AutomobileFactory.getVehicle(2);
		Vehicle vehicle4 = AutomobileFactory.getVehicle(1);
		
		vehicle1.specification();
		vehicle2.specification();
		vehicle3.specification();
		vehicle4.specification();
	}
}
