package regularExpression;

import java.util.regex.Pattern;

public class Regex_N4 
{
	public static void main(String[] args)
	{
		/*
		 * Regular Expression :-
		 * 8) [abc] ---> Represents a or b or c --simple class--
		 * 9) [^abc] ---> Represents a character which is (not a) and (not b) and (not c) --Negation--
		 */
		
		String regex = "[abc]";
		String input = "b";
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "c";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "[ab3R]";
		input = "R";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "B";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "3R";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "[^abc]";
		input = "k";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "c";
		result = Pattern.matches(regex, input);
		System.out.println(result);
	}
}
