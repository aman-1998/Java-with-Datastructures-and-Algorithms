package exceptionHandling;

import java.util.Scanner;

public class Exception_fifth {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 3 digits : ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int[] arr = {1,3,5,8,4};
		
		Exception_fifth ob = new Exception_fifth();
		ob.test1(a,b,c,arr);
	}
	public void test1(int a, int b, int c, int[] arr)
	{
		try 
		{
			for(int i = 0; i <= 4; i++)
				System.out.print(arr[i]);
			System.out.println();
			
			System.out.println("Quotient = "+a/b);
			
			Exception_fifth ob = new Exception_fifth();
			ob.test2(c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception : Udefined index \'"+e.getMessage()+"\' is accessed"
					+" at line number "+e.getStackTrace()[0].getLineNumber());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : \'"+e.getMessage()+"\' is occured ar line number "
					+e.getStackTrace()[0].getLineNumber());
		}
		catch(Exception e)
		{
			System.out.println("An exception occured at line number "
			+e.getStackTrace()[0].getLineNumber());
		}
	}
	public void test2(int c)
	{
		try 
		{
			Exception_fifth ob = null;
			ob.display();
			
			UserDefinedException ex = new UserDefinedException("Custom Exception");
			
			if(c == 1)
				throw ex;
		}
		catch(UserDefinedException e)
		{
			System.out.println("Exception : \'"+e.message()+"\' has occured at line number "
			+e.getStackTrace()[0].getLineNumber());
			System.out.println(e.getStackTrace()[0]);
			System.out.println(e.getStackTrace()[1]);
			System.out.println(e.getStackTrace()[2]);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception : \'"+e.getMessage()
			+"\' value is accessed at line number "+e.getStackTrace()[0].getLineNumber());
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("An exception occured at line number "
			+e.getStackTrace()[0].getLineNumber());
		}
	}
	public void display()
	{
		System.out.println("Hello World !");
	}
}

class UserDefinedException extends Exception
{
	private String msg;
	
	public UserDefinedException(String msg)
	{
		this.msg = msg;
	}
	public String message()
	{
		return msg;
	}
}
