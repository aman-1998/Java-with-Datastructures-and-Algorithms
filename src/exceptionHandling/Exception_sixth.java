package exceptionHandling;

import java.util.Scanner;

public class Exception_sixth {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		try 
		{
			try 
			{
				System.out.println(a/b);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception at line number "+e.getStackTrace()[0].getLineNumber());
			e.printStackTrace();
		}
	}

}
