package conceptOfThisSuper;

public class Male extends Human
{
	int weightLimit;
	
	public Male(int ageLimit, int weightLimit)
	{
		super(ageLimit);
		super.weightLimit = 250;
		this.weightLimit = weightLimit;
	}
	
	public String penis()
	{
		return "They have penis";
	}

	@Override
	public String toString() {
		return "Male [weightLimit=" + weightLimit + ", Human weight limit = " + super.weightLimit + ", ageLimit=" + ageLimit + ", penis()=" + penis()
				+ ", intelligent()=" + intelligent() + "]";
	}
	
	
}
