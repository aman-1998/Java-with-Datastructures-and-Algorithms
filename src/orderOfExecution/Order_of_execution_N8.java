package orderOfExecution;

public class Order_of_execution_N8 {
	
	public Order_of_execution_N8() {
		System.out.println("Hi constructor");
	}
	
	public static void main(String[] args) {
		
	}
	
	{
		System.out.println("Hi non-static");
	}
	
	static {
		System.out.println("Hi static");
	}
}


