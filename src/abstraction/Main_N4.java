package abstraction;

public class Main_N4 
{
	public static void main(String[] args)
	{
		Shape shape;
		shape = new Rectangle();
		shape.draw();
		shape.dimension();
		System.out.println("--------------------------");
		shape = new Circle();
		shape.draw();
		shape.dimension();
	}
}
