package polymophism;

public class Child extends Parent
{
	public void demo()
	{
		System.out.println("Just a casual message");
	}
	
	/*
	public void div(int op1, int op2)
	{
		System.out.println("Quotient = "+(op1 / op2));
	}*/ // for overriding return type should be same
	
	public void sum(int op1, int op2)
	{
		System.out.println("Sum is "+(op1 + op2));
	}
}

