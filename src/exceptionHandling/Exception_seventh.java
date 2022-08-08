package exceptionHandling;

public class Exception_seventh {
	
	public static void main(String[] args)
	{
		Exception_seventh ob = new Exception_seventh();
		
		int[] arr = {2,7,2,8,9};
		try
		{
			ob.test(arr);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nException : Index \'"+e.getMessage()+
			"\' is accessed at line number "+e.getStackTrace()[0].getLineNumber());
		}
	}
	public void test(int[] arr) throws ArrayIndexOutOfBoundsException
	{
		for(int i = 0; i <= 5; i++)
			System.out.print(arr[i]+" ");
	}

}
