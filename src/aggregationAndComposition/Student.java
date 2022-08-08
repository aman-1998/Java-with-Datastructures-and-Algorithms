package aggregationAndComposition;

public class Student 
{
	String name;
	Address address;
	
	public Student(String name, Address address)
	{
		this.address = address;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}
