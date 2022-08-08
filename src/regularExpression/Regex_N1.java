package regularExpression;

import java.util.regex.Pattern;

public class Regex_N1 
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
		String regex = "."; // .
		String input = "ey";
		
		/* Pattern.matches(regex, input) compiles the reges and matches the
		 * input against it. If it matches it returns 'true' else 'false'
		 */
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = ".";
		input = "4";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "...";
		input ="f%5";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "..";
		input = "1Yj";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = ".....Mishra";
		input = "Aman Mishra";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "Aman.....Mishra";
		input = "AmanKumarMishra";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "Aman$@5WxMishra";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "....@gmail.com";
		String input1 = "aman@gmail.com";
		String input2 = "amit@gmail.com";
		
		result = Pattern.matches(regex, input1);
		System.out.println(result);
		result = Pattern.matches(regex, input2);
		System.out.println(result);
		
		regex = "..abc...";
		input = "$^abc4f@";
		input1 = "21abc...";
		input2 = ".%aBc...";
		
		result = Pattern.matches(regex, input);
		System.out.println(result);
		result = Pattern.matches(regex, input1);
		System.out.println(result);
		result = Pattern.matches(regex, input2);
		System.out.println(result);
	}
}
