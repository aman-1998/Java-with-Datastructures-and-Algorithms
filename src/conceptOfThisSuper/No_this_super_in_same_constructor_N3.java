package conceptOfThisSuper;

public class No_this_super_in_same_constructor_N3 
{
	public static void main(String[] args)
	{
		Crow crow = new Crow("Black");
		Bird bird = new Bird("Rang-Biranga");
		System.out.println(crow);
		System.out.println(bird);
	}
}

class Bird
{
	String color;
	
	public Bird(String color)
	{
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bird [color=" + color + "]";
	}
}

class Crow extends Bird
{
	String color;
	
	public Crow()
	{
		super("colorfull");
	}
	
	public Crow(String color)
	{
		this();
		this.color = color;
	}

	@Override
	public String toString() {
		return "Crow [color=" + color + ", Bird family color=" + super.color + "]";
	}
}
