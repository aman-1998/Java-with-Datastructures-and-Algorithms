package inheritance;

public class Animal 
{
	public String grow()
	{
		return "They grow";
	}
	
	public String breathe()
	{
		return "They breathe";
	}
	
	public String eat()
	{
		return "The eat";
	}
}

class Cattle extends Animal
{
	public String legs()
	{
		return "They have 4 legs";
	}
	
	public String horn()
	{
		return "They have two horns";
	}
}

class Buffalo extends Cattle
{
	public String color()
	{
		return "They are black in color";
	}

	@Override
	public String toString() {
		return "Buffalo [color()=" + color() + ", legs()=" + legs() + ", horn()=" + horn() + ", grow()=" + grow()
				+ ", breathe()=" + breathe() + ", eat()=" + eat() + "]";
	}
	
	
}
