package regularExpression;

import java.util.regex.Pattern;

public class Regex_N2 
{
	public static void main(String[] args)
	{
		/*
		 * Regular Expression :-
		 * 1) . ---> Represents any character
		 * 2) \w  ---> Represents any word character i.e., alphabets(A-Z, a-z), digits(0-9) and underscore(_)
		 * 3) \W  ---> Represents not a word character
		 * 4) \s  ---> Represents a white space i.e., Escape sequences and Space
		 * 5) \S  ---> Represents not a white space
		 * 6) \d  ---> Represents a digit (0-9)
		 * 7) \D  ---> Represents not a digit
		 */
		String regex = "\\w"; // \w
		String input = "3";
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "\\w\\w";
		input = "D&";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "\\w\\w\\w\\w";
		input = "Fd5_";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "\\w\\w.";
		input = "t7#";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "\\Waa.\\w..";  // \W
		input = "$aa5_T^";
		result = Pattern.matches(regex, input);
		System.out.println(result);
	}
}
