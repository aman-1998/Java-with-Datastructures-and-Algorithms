package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_N9 
{
	public static void main(String[] args)
	{
		/*
		 * Regular Expression :-
		 * 19) X{n} ---> X occurs n times (Occurance of X = n times)
		 * 20) X{n,} ---> X occurs n or more times (Occurance of X >= n times)
		 * 21) X{n,m} ---> X occurs n or more times but not more than m times (n <= Occurance of X <= m)
		*/
		String regex = "[k-p]{3}";
		String input = "kmm";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		boolean result = matcher.matches();
		System.out.println(result);
		
		regex = "abj{2}";
		input = "abjj";
		
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		
		result = matcher.matches();
		System.out.println(result);
		
		regex = "a[^a-e]{4,}";
		input = "aghijk";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "aghi";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
		
		regex = "[a-d]{3,5}";
		input = "bda";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
		
		input = "bdabb";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
		
		input = "bdabbe";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
		
		input = "bd";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
		
		input = "bdr";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
	}
}
