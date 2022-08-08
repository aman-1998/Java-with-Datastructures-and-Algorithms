package static_inner_class;

public class OuterS
{
	private static int x;

	private static float f = 3.5f;
	
	public static class Inner
	{
		private int y;
		private float f;
		
		public Inner(int y,float f)
		{
			this.y=y;
			this.f=f;
		}
		
		public int display()
		{
			System.out.println("Outer x = "+x+" Outer f = "+OuterS.f+" Inner f = "+f);
			System.out.println("Returning the value of \'y\'");
			return y;
		}
	}
}
