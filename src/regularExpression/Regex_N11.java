package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_N11 
{
	public static void main(String[] args)
	{
		// All string starting with dog
		String regex = "dog(.*)";
		String input = "dogscvv@%$#%$%fhhttaxcgdrtgrr$&%*+@~~!sdvdn8574%$hf";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean result = matcher.matches();
		System.out.println(result);
		
		// All string ending with good
		regex = "(.*)good";
		input = "gscvv@%$#%$%fhhttaxcgdrtgrr$&%*+@~~!sdvdn8574%$hfgood";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
		
		// All strings ending with any alphabet in upper case
		regex = "(.*)[A-Z]";
		input = "nqwjsbq1y01b@!@#%GVBR%$34333%$^5463244#%G";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
	}
}
