package exceptionHandling;

import java.util.Scanner;

public class Finally_block2 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer("Aman Mishra");
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		try 
		{
			int q = a/b;
			System.out.println("Quotiont = "+q);
			
			System.out.println("StringBuffer : "+sb);
			for(int i = 0; i <= 11; i++)
				System.out.print(sb.charAt(i));
			
			System.out.println("\nBhai mujhe v bacha lo !");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("\nException : Index \'"+e.getMessage()
			+"\' is accessed at line number "+e.getStackTrace()[0].getLineNumber());
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Exception : \'"+e.getMessage()
			+"\' occured at line number "+e.getStackTrace()[0].getLineNumber());
		}
		finally
		{
			System.out.println("This piece of code definetely get executed");
		}
		System.out.println("hey !");
	}

}
