package stringConcept;

public class Overriding_equals_toString_N2 
{
	public static void main(String[] args)
	{
		Dog dog1 = new Dog("Tommy", "German Shephard", "Aman");
		Dog dog2 = new Dog("Tiger", "Dogo Argentino", "Bhola");
		Dog dog3 = new Dog("Tommy", "German Shephard", "Aman");
		
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		System.out.println(dog1.equals(dog2));
		System.out.println(dog1.equals(dog3));
	}
}
