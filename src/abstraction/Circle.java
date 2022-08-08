package abstraction;

public class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing circle by joining all the points which are at same distance from a fixed point");
	}
	
	public void area()
	{
		System.out.println("Area = \u03C0*r*r");
	}
}
