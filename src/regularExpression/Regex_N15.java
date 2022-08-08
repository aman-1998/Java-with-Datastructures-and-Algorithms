package regularExpression;

import java.util.regex.Pattern;

public class Regex_N15 
{
	public static void main(String[] args)
	{
		String regex1 = "[[A-Z][a-z]](\\d+)[[A-Z][a-z]]";
		String regex2 = "\\d";
		
		String input = "hdvgfw1413scsswegj$@@#$12!#!fdv2402323F@$@#$r4d";
		
		Pattern pattern = Pattern.compile(regex1);
		String[] substrArr1 = pattern.split(input);
		for(String str : substrArr1)
			System.out.println(str);
		System.out.println("Lenght of substrArr1 = "+substrArr1.length);
		
		System.out.println("---------------------------------------------------");
		
		pattern = Pattern.compile(regex2);
		String[] substrArr2 = pattern.split(input);
		for(String str : substrArr2)
			System.out.println(str);
		System.out.println("Lenght of substrArr2 = "+substrArr2.length);
	}
}
