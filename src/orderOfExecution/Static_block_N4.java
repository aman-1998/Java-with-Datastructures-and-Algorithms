package orderOfExecution;

public class Static_block_N4
{
	static int[] arr = new int[5];
	
	public static void main(String[] args)
	{
		System.out.println("Array:-");
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	//static blocks are used for initialization / complex-initialization of static variables
	static {
		int index = 0;
		for(int i = 1; i <= 10; i+=2)
			arr[index++] = i;
	}
}
