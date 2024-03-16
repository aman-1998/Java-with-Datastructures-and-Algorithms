package designPatterns.creational.abstractFactory;
/*
 * Pros:
 * 1. Provides abstraction
 * 2. Hides complexity of creation of object
 * 3. Follows Single Operation Principle
 * 4. Follows Open Closed Principle
 * 
 * 
 * Disadvantage:
 * 1. Can be difficult for new developers to understand the flow
 * 
 * 
 * Usage: 
 * 1. DocumentBuilderFactory class in Java
 * 
 * 
 * When to use it:
 * 1. If we want to create different objects of similar type but different properties. 
 * And also objects can be divided based on two or factories.
 * 2. We want to hide the complex process of creation of objects.
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		AutomobileFactory abstractFactory = AutomobileFactory.getFactory(4);
		Vehicle vehicle = abstractFactory.deliver("Off-Roading");
		
		if(vehicle != null) {
			vehicle.specification();
		} else {
			System.out.println("We don't make such a vehicle");
		}
		
		System.out.println("-----------------------------------------");
		
		AutomobileFactory abstractFactory2 = AutomobileFactory.getFactory(4);
		Vehicle vehicle2 = abstractFactory2.deliver("sports");
		
		if(vehicle2 != null) {
			vehicle2.specification();
		} else {
			System.out.println("We don't make such a vehicle");
		}
		
		System.out.println("-----------------------------------------");
		
		AutomobileFactory abstractFactory3 = AutomobileFactory.getFactory(2);
		Vehicle vehicle3 = abstractFactory3.deliver("Sports");
		
		if(vehicle3 != null) {
			vehicle3.specification();
		} else {
			System.out.println("We don't make such a vehicle");
		}
		
	}
}
