package stringConcept;

public class Overriding_equals {
	
	public static void main(String[] args)
	{
		Student aman = new Student("Aman Kumar Mishra",137);
		Student babu = new Student("Aman Kumar Mishra",137);
		
		String info = aman.toString();	
		System.out.println(info);
		
		if(aman.equals(babu) == true)
			System.out.println("Both are same");
		else
			System.out.println("Both are not same");
	}

}
