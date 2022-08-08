package arrays;

import java.util.Scanner;

public class Array_Main 
{
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,7,8,9};
		
		for(int i = 0; i <= arr1.length-1; i++)
			System.out.println(arr1[i]);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no. of inputs: ");
		int n = in.nextInt();
		in.nextLine();
		String[] names = new String[n];
		
		for(int i = 0; i <= names.length-1; i++)
		{
			System.out.print("Enter names["+i+"] : ");
			names[i] = in.nextLine();
		}
		
		System.out.println("NAMES: - ");
		
		for(String i: names)
			System.out.print(i+"\n");
	}
}
