package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_N10 
{
	public static void main(String[] args)
	{
		//Regex that accepts alphanumeric characters and length is 4
		
		String regex1 = "[[a-z][A-Z][0-9]]*"; // Regex for alphanumeric
		String regex2 = "[[\\w]&&[^_]]*"; // Regex for alphanumeric
		
		String input = "fh5jnn33094n4b53bt35bhk65hbj4644h56n6j44n54564k5kbknk4h";
		
		Pattern pattern = Pattern.compile(regex1);
		Matcher matcher = pattern.matcher(input);
		boolean result = matcher.matches();
		System.out.println(result);
		
		pattern = Pattern.compile(regex2);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
	}
}
