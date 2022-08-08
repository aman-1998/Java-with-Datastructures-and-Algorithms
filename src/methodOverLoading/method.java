package methodOverLoading;

public class method {
	
	public static void main(String args[])
	{
		
		int s=sum(3,5);
		System.out.println(s);
		System.out.println("**************************************************");
		int p=mul(5,9);
		System.out.println(p);
		
		// Method over loading
		int x=area(4,8);
		int y=area(6);
		System.out.println("Area of rectangle = "+x);
		System.out.println("Area of square = "+y);
		
		calculate ob = new calculate();
		boolean check = ob.prime(2);
		
		if(check == true)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static int mul(int a,int b) 
	{
		return a*b;
	}
	public static int area(int l,int b)
	{
		return l*b;
	}
	public static int area(int side)
	{
		return side*side;
	}
}
