package exceptionHandling;

public class Exception_handling_N2 {
	
	public static void main(String[] args)
	{
		int[] arr = {1,4,6,7};
		int a = 12;
		int b = 4;
		
		try {
			for(int i = 0; i <= 3; i++)
				System.out.println(arr[i]);
			
			System.out.println(a/b);
			
			int flag = 1;
			
			if(flag == 1)
				throw new CustomException1("Custom Exception occured");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(CustomException1 e) {
			System.out.println(e.getMessage() + " at " + e.getStackTrace()[0].getLineNumber());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class CustomException1 extends Exception {
	
	String message = null;
	public CustomException1(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
