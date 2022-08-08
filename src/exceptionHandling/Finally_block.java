package exceptionHandling;

import java.util.Scanner;

public class Finally_block {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		try 
		{
			System.out.println("Quotient = "+a/b);
			
			System.out.println("Aree bhai mujhe v finally mei le lo !");
		}
		finally
		{
			System.out.println("Hum to alag hain, chal k rahenge !");
		}
		
	}

}
