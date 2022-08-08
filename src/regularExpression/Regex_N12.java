package regularExpression;

import java.util.regex.Pattern;

public class Regex_N12 
{
	public static void main(String[] args)
	{
		/*
		 * Regular Expression :-
		 * 22) X|Y ---> Either X is matched or Y is matched
		 * 23) XY ---> X followed by Y
		*/
		
		String regex = "(.*)India(.*)";
		String input = "East or West India is the best";
		boolean result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "((.*)India(.*))|((.*)Bharat(.*))";
		input = "East or West India is the best. Bharat mahan";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "East or West Idia is the best. Bharat mahan";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "East or West India is the best. Barat mahan";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		input = "East or West Idia is the best. Barat mahan";
		result = Pattern.matches(regex, input);
		System.out.println(result);
	}
}
