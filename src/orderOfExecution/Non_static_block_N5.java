package orderOfExecution;

public class Non_static_block_N5
{
	static int[] arr = new int[5];
	
	public static void main(String[] args)
	{
		new Non_static_block_N5();
		
		System.out.println("Array:-");
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
