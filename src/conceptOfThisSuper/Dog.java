package conceptOfThisSuper;

public class Dog extends Animal
{
	int maxAge;
	
	public Dog(int maxAge)
	{
		this.maxAge = maxAge;
	}
	
	public String bark()
	{
		return "It barks";
	}
	
	public String legs()
	{
		return "It has 4 legs";
	}
}
