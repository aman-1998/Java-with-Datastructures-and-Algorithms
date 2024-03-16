package designPatterns.creational.builder;
/*
 * Pros:
 * 1. All properties are set in one place. So, it prevents scattering of setting of properties.
 * 2. Constructors can't solve the problem of setting different properties in any order. If we make
 * a constructor with all fields, in that case we have to send some elements null which we don't want to set.
 * But we don't want to set them to null. They should have some default value.
 * So, build patterns solves this problem.
 * 3. Refactoring is easier.
 * 
 * 
 * Disadvantage:
 * 1. Extra Builder class is required
 * 
 * 
 * Usage: 
 * 1. StringBuilder
 * 
 * 
 * When to use it:
 * 1. To make complex objects.
 * 2. If all(or maximum properties) need to be set at once.
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		Phone phone = new Phone("android", "Qualcom Snapdragon 625", "6 GB", "20 Mega px", "4100 mah");
		System.out.println(phone);
		
		PhoneBuilder phoneBuilder = new PhoneBuilder();
		
		Phone phone1 = phoneBuilder.setOs("Android").setBattery("5000 mah").build();
		System.out.println(phone1);
		
		Phone phone2 = phoneBuilder.setOs("IOS").build();
		System.out.println(phone2);
		
		Phone phone3 = phoneBuilder.setOs("Android").setProcessor("Qualcom Snapdragon 636").setBattery("4100 mah").build();
		System.out.println(phone3);
	}
}
