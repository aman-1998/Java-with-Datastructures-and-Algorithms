package inheritance;

public class Flower 
{
	public String smell()
	{
		return "Pleasant smell";
	}
	
	public String petals()
	{
		return "Soft petals";
	}
	
	public String attractive()
	{
		return "Attractive";
	}
}

class Rose extends Flower
{
	public String color()
	{
		return "Red in color";
	}
	
	public String stem()
	{
		return "Stem has thorns";
	}

	@Override
	public String toString() 
	{
		return "Rose \n________________________\nColor = " + color() + "    |" + "\nStem = " + stem() + "  |" + "\nSmell = " + smell() + "  |" + "\nPetals =" + petals() + "     |" + "\nAttractive =" + attractive() +"  |" + "\n-------------------------";
	}
	
	
}