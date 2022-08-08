package static_inner_class;

import java.util.*;

public class StaticInnerClass_Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int y = in.nextInt();
		float f = in.nextFloat();
		in.close();
		
		OuterS.Inner inn = new OuterS.Inner(y, f);
		int p = inn.display();
		System.out.println("Inner y = "+p);
	}
}
