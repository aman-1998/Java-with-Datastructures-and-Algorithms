package arrays;

import java.util.Scanner;

public class Arrays_N1 
{
	public static void main(String[] args)
	{
		int[] arr1 = {2,4,7,1,7,5,9};
		
		System.out.println("Array arr1:-");
		
		int count = 0;
		for(int i : arr1)
		{
			count++;
			if(count == arr1.length)
				System.out.print(i);
			else
				System.out.print(i+", ");
		}
		
		String[] strArr = new String[4];
		strArr[0] = "Aman";
		strArr[1] = "Bablu Bhattacharya";
		strArr[2] = "Manish Kundu";
		strArr[3] = "Geeta Rani";
		
		System.out.println("\nArray strArr:-");
		for(int i = 0; i <= strArr.length-1; i++)
			System.out.print(strArr[i]+", ");
		
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter no. of inputs: ");
		int n = in.nextInt();
		int[] arr2 = new int[n];
		for(int i = 0; i <= n-1; i++)
		{
			System.out.print("Enter arr2["+i+"]: ");
			arr2[i] = in.nextInt();
		}
		
		System.out.println("Array arr2:-");
		
		count = 0;
		for(int i : arr2)
		{
			count++;
			if(count == arr2.length)
				System.out.print(i);
			else
				System.out.print(i+", ");
		}
		
		char[] arr3;
		arr3 = new char[5];
		int index = 0;
		for(int i = 65; i <= 69; i++)
			arr3[index++] = (char)i;
		
		System.out.println("\nArray arr3:-");
		for(char c : arr3)
			System.out.print(c+" ");
	}
}
