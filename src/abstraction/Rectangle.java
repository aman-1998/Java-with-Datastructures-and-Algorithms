package abstraction;

public class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Rectangle by making opposite sides equal with all sides meeting at 90\u00B0");
	}
	
	public void area()
	{
		System.out.println("Area = 2*(L+B)");
	}
}
