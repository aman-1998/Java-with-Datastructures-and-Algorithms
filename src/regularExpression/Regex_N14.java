package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_N14 
{
	public static void main(String[] args)
	{
		String regex = "India(\\d+)f";
		String input = "I love my India6173f.. Ye mera India4f.. Indiaf great";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean result = matcher.matches();
		System.out.println(result);
		int count = 0;
		while(matcher.find() == true) // find()
		{
			count++;
			
			System.out.println(matcher.group()+" found starting from index "
			+matcher.start()+" to "+matcher.end());
		}
		
		System.out.println(count);
		
	}
}
