package regularExpression;

import java.util.regex.Pattern;

public class Regex_N8 
{
	public static void main(String[] args)
	{
		/*
		 * Regular Expression :-
		 * 16) X? ---> X one or zero time
		 * 17) X+ ---> X one or more time
		 * 18) X* ---> X zero or more time
		*/
		String regex = "[abc]?";
		String input = "b";
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "ab";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "\\d?";
		input = "7";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "T";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "[a-z]+";
		input = "f";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "adjbabjabjewbdjbuwdwnwfwfcsbcwwetuqqcapqeqmxszcsdwdnckcwwkwif";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "ab*";
		input = "abbbbbbbbbbbbbbbbbb";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "ab";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "a";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "abc[[a-z][A-Z]]*"; // all strings starting with abc
		input = "abcandhwidweJIOSDAsaAUISskSKUSsuiwsnoclksmwibSDWKWCWKWE";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "abc";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "abc4";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "ab";
		result = Pattern.matches(regex, input);
		System.out.println(result);
	}
}
