package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_N21 
{
	public static void main(String[] args)
	{
		// regular expression to accept (") is (\") not (\\")  --Exception
		String regex = "[A-Z]*\"[A-Z]*";
		String input = "DADADNDNWERAA\'WFVEBQWVFVERGVVFGQQG";
		
		System.out.println(input);
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		boolean result = matcher.matches();
		System.out.println(result);
	}
}
