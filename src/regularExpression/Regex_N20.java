package regularExpression;

public class Regex_N20 
{
	public static void main(String[] args)
	{
		/*
		 * Replace 2 or more spaces with single space in string 
		 * and delete leading spaces only.
		 */
		
		String regex = "[ ][ ][ ]*";
		String input = "a$^fd%46DG a  !#D2&j`?      n$#2fr2DF   sD#1    ";
		
		String str = input.replaceAll(regex, " ");
		System.out.println(str);
		System.out.println(str.length());
		str = str.trim();
		System.out.println(str.length());
	}
}
