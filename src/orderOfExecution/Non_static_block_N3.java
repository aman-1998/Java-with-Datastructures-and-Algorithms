package orderOfExecution;

public class Non_static_block_N3 
{
	static int[] arr = new int[5];
	
	public static void main(String[] args)
	{	
		System.out.println("Array:-");
		for(int i : arr)
			System.out.print(i+" ");
		
		int index = 0;
		for(int i = 1; i <= 5; i++)
			Non_static_block_N3.arr[index++] = i;
		
		System.out.println("\nArray:-");
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	//non-static blocks are used for initialization / complex-initialization
	{
		int index = 0;
		for(int i = 1; i <= 10; i+=2)
			arr[index++] = i;
	}
}
