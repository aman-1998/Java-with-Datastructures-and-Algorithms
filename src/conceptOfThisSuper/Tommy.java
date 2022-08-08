package conceptOfThisSuper;

public class Tommy extends Dog
{
	private int currAge;
	
	public Tommy(int currAge, int maxAge)
	{
		super(maxAge);
		this.currAge = currAge;
	}

	public String faithful()
	{
		return "It is faithful";
	}
	
	public String whiteColor()
	{
		return "It is white in color";
	}

	@Override
	public String toString() {
		return "Tommy [currAge=" + currAge + ", maxAge=" + maxAge + ", faithful()=" + faithful() + ", whiteColor()="
				+ whiteColor() + ", bark()=" + bark() + ", legs()=" + legs() + ", grow()=" + grow() + ", eat()=" + eat()
				+ ", move()=" + move() + ", breathe()=" + breathe() + "]";
	}

		
	
}
