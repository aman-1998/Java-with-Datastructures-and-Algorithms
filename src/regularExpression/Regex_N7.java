package regularExpression;

import java.util.regex.Pattern;

public class Regex_N7 
{
	public static void main(String[] args)
	{
		/*
		 * Regular Expression :-
		 * 14) [a-z&&m-p] ---> Represents any character from A to Z, or a to z (inclusive)
		 * 15) [a-z&&[m-p]] ---> Represents any character from a to d, or m to p, or both (inclusive) --Union--
		 * both are same 14 and 15. So, we will always use [[a-z]&&[m-p]]
		 */
		String regex = "[[a-z]&&[m-p]]";
		String input = "r";
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "o";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "N";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "[[k-p]&&[^u-z]]";
		input = "m";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "q";
		result = Pattern.matches(regex, input);
		System.out.println(result);
	}
}
