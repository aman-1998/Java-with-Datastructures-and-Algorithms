package regularExpression;

import java.util.regex.Pattern;

public class Regex_N5 
{
	public static void main(String[] args)
	{
		/*
		 * Regular Expression :-
		 * 10) [A-Z] ---> Represents any character from A to Z (inclusive)
		 * 11) [^a-z] ---> Represents any character not in range a to z (inclusive)
		 */
		String regex = "[A-Z]";
		String input = "Q";
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "e";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "[^a-z]";
		input = "A";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "z";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "%";
		result = Pattern.matches(regex, input);
		System.out.println(result);
	}
}
