package regularExpression;

import java.util.regex.Pattern;

public class Regex_N13
{
	public static void main(String[] args)
	{
		/*
		 * Regular Expression :-
		 * 24) You have to use \\ to use define single backslash
		 * 25) If you want to use backslash as literal then you have to use \\\\ because \ is an escape character
		*/
		
		// Regular expression which matches with all strings which does not contain <, > , \ or \n
		String regex = "[^<>\\n\\\\]*"; 
		String input = "mfow#^#5\\";
		boolean check = input.matches(regex);
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		System.out.println(check);
	}
}
