package orderOfExecution;

public class Order_of_execution_N7 {
	
	public static void main(String[] args)
	{
		new TEST1("Hello");
		new TEST2();
		new TEST2();
	}
}

class TEST1
{
	public TEST1(String str)
	{
		System.out.println(str);
		//System.out.println("3rd execution");
	}
}

class TEST2 extends TEST1
{
	public TEST2()
	{
		super("2nd execution");
		System.out.println("5th execution");
	}
	
	{
		System.out.println("4th execution");
	}
	
	static {
		System.out.println("1st execution");
	}
}