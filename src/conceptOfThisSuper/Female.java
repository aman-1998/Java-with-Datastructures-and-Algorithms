package conceptOfThisSuper;

public class Female extends Human
{
	int weightLimit;
	
	public Female(int ageLimit, int weightLimit)
	{
		super(ageLimit);
		super.weightLimit = 250;
		this.weightLimit = weightLimit;
	}
	
	public String vagina()
	{
		return "They have vagina";
	}

	@Override
	public String toString() {
		return "Female [weightLimit=" + weightLimit + ", Human weight limit = " + super.weightLimit + ", ageLimit=" + ageLimit + ", vagina()=" + vagina()
				+ ", intelligent()=" + intelligent() + "]";
	}
	
}
