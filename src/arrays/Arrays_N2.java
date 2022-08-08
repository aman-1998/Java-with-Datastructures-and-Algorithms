package arrays;

public class Arrays_N2 
{
	public static void main(String[] args)
	{
		int[] arr = new int[4];
		arr[0] = 23;
		arr[1] = 34;
		arr[2] = 45;
		arr[3] = 18;
		Arrays_N2 ob = new Arrays_N2();
		int[] arr2 = ob.copy(arr);
		
		System.out.println("Array:-");
		for(int i : arr2)
			System.out.print(i+" ");
	}
	
	public int[] copy(int[] arr)
	{
		int[] arr2 = new int[arr.length];
		
		for(int i = 0; i <= arr.length - 1; i++)
			arr2[i] = arr[i];
		return arr2;
	}
}
