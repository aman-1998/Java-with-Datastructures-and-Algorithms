package regularExpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_N17 
{
	public static void main(String[] args)
	{
		// Split string by new lines
		String regex = "\\n";
		String input = "snnw1!%$^234F\nTWw\n&\n\n@3dddvR\n\t5\nYdv@$@";
		
		Pattern pattern = Pattern.compile(regex);
		String[] subStrArr = pattern.split(input);
		
		for(String str : subStrArr)
			System.out.println(str);
		
		System.out.println("-----------------------------------------");
		
		ArrayList<String> arr = new ArrayList<String>();
		regex = "[^\\n]+";
		pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while(matcher.find() == true)
			arr.add(matcher.group());
		
		for(String str : arr)
			System.out.println(str);
	}
}
