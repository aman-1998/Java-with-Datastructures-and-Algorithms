package polymophism;

public class Parent 
{
	public void sum(int op1, int op2)
	{
		System.out.println("Sum = "+(op1 + op2));
	}
	
	private void minus(int op1, int op2)
	{
		System.out.println("Difference = "+(op1 - op2));
	}
	
	public void mul(int op1, int op2)
	{
		System.out.println("Product = "+(op1 * op2));
	}
	
	public int div(int op1, int op2)
	{
		return op1 / op2;
	}
}