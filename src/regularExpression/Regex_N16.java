package regularExpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_N16 
{
	public static void main(String[] args)
	{
		// Extract numbers from a String
		String regex = "[^\\d]+";
		String input = "d745@%@%$#geg34566674$@#fdgRTHG5gtg#%#gg5Ft#63";
		
		Pattern pattern = Pattern.compile(regex);
		
		String[] numbers = pattern.split(input);
		
		for(String str : numbers)
			System.out.println(str);
		
		System.out.println("\n----------------------------------------");
		
		ArrayList<String> numb = new ArrayList<String>();
		regex = "\\d+";
		pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while(matcher.find() == true)
			numb.add(matcher.group());
		
		for(String str : numb)
			System.out.println(str);
	}
}
