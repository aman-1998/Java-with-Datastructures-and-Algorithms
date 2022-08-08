package exceptionHandling;

import java.util.Scanner;

public class Eception_first {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		try 
		{
			int c = a/b;
			System.out.println("Quotient = "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero exception");
			System.out.println(e.getMessage());
			String str = e.getStackTrace()[0].toString();
			System.out.println(str);
			System.out.println(e.getStackTrace()[0].getLineNumber());
			System.out.println(e.getStackTrace()[0].getClassName());
			System.out.println(e.getStackTrace()[0].getMethodName());
			System.out.println(e.getStackTrace()[0].getFileName());
			//System.out.println(e.getStackTrace()[1]);
			e.printStackTrace();
		}
		
		//System.out.println("Next code goes here");
	}

}
