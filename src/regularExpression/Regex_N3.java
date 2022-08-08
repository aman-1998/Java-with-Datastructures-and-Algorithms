package regularExpression;

import java.util.regex.Pattern;

public class Regex_N3 
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
		String regex = "\\s"; // \s
		String input = " ";
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "\n";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "\\w\\s.\\S\\W";  // \S
		input = "R *[!";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "\\d..";
		input = "wg^";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "\\d\\w\\s\\S\\D\\W.";  // \D
		input = "6_\n&#+-";
		result = Pattern.matches(regex, input);
		System.out.println(result);
	}
}
