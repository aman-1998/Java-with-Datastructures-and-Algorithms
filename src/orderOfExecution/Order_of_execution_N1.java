package orderOfExecution;

public class Order_of_execution_N1 {
	
	public static void main(String[] args)
	{
		new TEST();
		new TEST();
	}
}

class TEST
{
	public TEST()
	{
		// super(); ---- added automatically
		System.out.println("We are inside constructor");
	}
	
	{
		System.out.println("We are inside non-static block");
	}
	
	static {
		
		System.out.println("We are inside static block");
	}
}
