package exceptionHandling;

import java.util.Scanner;

public class Exception_fourth {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int[] arr = {1,5,6,7,3,5,2};
		
		System.out.print("Enter any three integers");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		Exception_fourth obj = null;
		
		try
		{
			
			for(int i = 0; i <= 7; i++)
				System.out.println(arr[i]);
			
			System.out.println("Quotient = "+(a/b));
			
			CustomException ex = new CustomException();
			
			if(c == 1)
				throw ex;
			
			obj.test();
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception : Index "+e.getMessage()+" is not defined for \'arr\'");
			System.out.println(e.getStackTrace()[0]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : "+e.getMessage());
			System.out.println(e.getStackTrace()[0]);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception : In line number "+e.getStackTrace()[0].getLineNumber()
					+", \'"+e.getMessage()+"\' value is referred");
		}
		catch(CustomException e)
		{
			System.out.println("Exception : "+e.msg());
			System.out.println(e.getStackTrace()[0]);
		}
		catch(Exception e)
		{
			System.out.println("Some kind of exception has occured in File : "+
			e.getStackTrace()[0].getFileName()+", Class : "+e.getStackTrace()[0].getClassName()
			+", Method Name : "+e.getStackTrace()[0].getMethodName()+" and Line Number : "+
			e.getStackTrace()[0].getLineNumber());
		}
	}
	public void test()
	{
		System.out.println("My name is Anthony on service");
	}
}

class CustomException extends Exception
{
	public String msg()
	{
		return "Custom exception occured";
	}
}