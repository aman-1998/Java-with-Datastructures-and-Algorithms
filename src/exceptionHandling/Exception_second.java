package exceptionHandling;

import java.util.Scanner;

public class Exception_second {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int[] arr = {1,5,6,7,3,5,2};
		
		System.out.print("Enter any two integers");
		int a = in.nextInt();
		int b = in.nextInt();
		
		Exception_second obj = null;
		
		try
		{
			for(int i = 0; i <= 7; i++)
				System.out.println(arr[i]);
			
			System.out.println("Quotient = "+(a/b));
			
			obj.test();
		}
		catch(Exception e)
		{
			System.out.println("Eception : "+e.getMessage());
			System.out.println(e.getStackTrace()[0]);
			e.printStackTrace();
		}
		
		System.out.println("Hi, I am Aman Kumar Mishra");
	}
	public void test()
	{
		System.out.println("My name is Anthony on service");
	}
}
