package exceptionHandling;

public class Exception_eight {
	
	public static void main(String[] args)
	{
		try
		{
			throw new CustomException2("Custom Exception occured");
		}
		catch(CustomException2 e)
		{
			System.out.println(e.getMessage());
		}
	}

}

class CustomException2 extends Exception
{
	public CustomException2(String message)
	{
		super(message);
	}
}
