package arrays;

import java.util.Scanner;

public class Array_revise {
	
	public static void main(String[] args)
	{
		int[] arr1 = {3,6,7,1,7,2,1,8};
		
		for(int i : arr1)
			System.out.println(i);
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr2 = new int[n];
		
		for(int i = 0; i <= n-1; i++)
		{
			System.out.print("Enter arr2["+i+"] : ");
			arr2[i] = in.nextInt();
		}
		
		System.out.println("Array:-");
		
		for(int i = 0; i <= arr2.length - 1; i++)
			System.out.print(arr2[i]);
	}

}
