package aggregationAndComposition;

public class Main_N1 
{
	public static void main(String[] args)
	{
		Address address = new Address("Salkia","Flat No 2B","29 Bhairab Dutta lane","Shree Satyabarayan Appartment");
		Student student = new Student("Aman",address);
		System.out.println(student);
	}
}
