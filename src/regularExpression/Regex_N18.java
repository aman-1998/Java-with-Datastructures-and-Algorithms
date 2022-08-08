package regularExpression;

import java.util.Scanner;

public class Regex_N18 
{
	public static void main(String[] args)
	{
		// match a(n-times)b(n-times)
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = in.nextInt();
		String regex = "a{"+n+"}b{"+n+"}";
		String input = "aaabbb";
		boolean result = input.matches(regex);
		System.out.println(result);
	}
}
