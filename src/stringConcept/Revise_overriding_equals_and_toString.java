package stringConcept;

public class Revise_overriding_equals_and_toString {
	
	public static void main(String[] args)
	{
		Car car1 = new Car("Thar LX Diesel", true, "SUV", "Mahindra");
		Car car2 = new Car("Thar AX Diesel", true, "SUV", "Mahindra");
		
		System.out.println(car1);
		System.out.println(car2);
		
		if(car1.equals(car2) == true)
			System.out.println("Both are same");
		else
			System.out.println("Both are different");
	}
}
