package finalConcept;

public class FinalVar_N1
{	
	public static void main(String[] args)
	{
		Test test = new Test(777);
		test.fun1();
		System.out.println(Test.var5);
		System.out.println(Test.var6);
	}
}

class Test
{
	private final int var1 = 134;
	private final int var2;
	public static final int var5 = 575;
	public static final int var6;
	
	public Test(int var2)
	{
		this.var2 = var2;
	}
	
	public void fun1()
	{
		final int var3;
		final int var4 = 256;
		System.out.println("Hi UFC"+var4);
		var3 = 67;
		System.out.println("Bye UFC"+var3);
		System.out.println("Bye UFC"+var1);
		System.out.println("Bye UFC"+var2);
	}
	
	static
	{
		var6 = 52;
	}
}
