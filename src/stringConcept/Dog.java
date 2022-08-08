package stringConcept;

public class Dog 
{
	private String name;
	private String type;
	private String ownerName;
	
	public Dog(String name, String type, String ownerName)
	{
		this.name = name;
		this.type = type;
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString()
	{
		return "Dog[name = "+name+", type = "+type+", ownerName = "+ownerName+"]";
	}
	
	public boolean equals(Dog dog)
	{
		boolean first = this.name.equals(dog.name);
		boolean second = this.type.equals(dog.type);
		boolean third = this.ownerName.equals(dog.ownerName);
		
		return first && second && third;
	}
}
