package exceptionHandling;

import java.util.Scanner;

public class Finally_block3 {
	
	public static void main(String[] args)
	{
		String str = "Aman Mishra";
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		try
		{
			System.out.println(a/b);
			
			for(int i = 0; i <= 11; i++)
				System.out.println(str.charAt(i));
			return;
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occured at line no. "
			+e.getStackTrace()[0].getLineNumber());
		}*/
		finally
		{
			System.out.println("I will definitely get executed !");
		}
		//System.out.println("I don't know !");
	}
}
