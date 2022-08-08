package regularExpression;

import java.util.regex.Pattern;

public class Regex_N6 
{
	public static void main(String[] args)
	{
		/*
		 * Regular Expression :-
		 * 12) [A-Za-z] ---> Represents any character from A to Z, or a to z (inclusive)
		 * 13) [a-d[m-p]] ---> Represents any character from a to d, or m to p, or both (inclusive) --Union--
		 * both are same 12 and 13. So, we will always use [[A-Z][a-z]] --Union--
 		*/
		String regex = "[A-Za-z]";
		String input = "t";
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "P";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "Om";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "[a-d[m-p]]";
		input = "c";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "n";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "bp";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "r";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "[[A-Z][a-z]]";
		input = "f";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "Z";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "Ls";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "[[d-x][$#ZB]]";
		input = "e";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "C";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "B";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "#";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "$";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "&";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "[[3-8][^abc]]";
		input = "d";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "b";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "4";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "2";
		result = Pattern.matches(regex, input);
		System.out.println(result);
	}
}
