package orderOfExecution;

public class Static_concept_N6 
{
	public static void main(String[] args)
	{
		TESTING.fun3(); //Whenever class loads at that time static block executes once
		new TESTING().fun2(); //static block will not be executed as it is already executed
	}
}

class TESTING
{
	static int var;
	
	static {
		
		System.out.println("Initializing static var");
		var = 1 << 31 -1;
	}
	
	public void fun1()
	{
		System.out.println("Hello");
	}
	
	public void fun2()
	{
		fun1();
	}
	
	public static void fun3()
	{
		System.out.println("var = "+var);
	}
	
	{
		System.out.println("Aman");
	}
}
