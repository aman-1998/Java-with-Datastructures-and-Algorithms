package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rgex_all_in_one_N22 {
	public static void main(String[] args) {
		String regex = "[[a-z][4F#&]]\\d{2,}";
		String input = "bdi$1883489bsie6csyft67vsyy235642sch47$4638g6666";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find() == true) {
			System.out.println(matcher.group() + "is found with starting index " + matcher.start()
					+ " and ending index " + matcher.end());
		}
		
		System.out.println("\n=======================================\n");
		
		input = "423792137";
		matcher = pattern.matcher(input);
		boolean result = matcher.matches();
		System.out.println(result);
		
		input = "&236";
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
		
		input = "#5";
		result = Pattern.matches(regex, input);
		System.out.println(result);
		
		regex = "a{2,}";
		input = "aa";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);
		result = matcher.matches();
		System.out.println(result);
		
		System.out.println("\n=======================================\n");
		
		regex = "%[[$^&d]&&[vs^f$d]]";
		input = "dbidk^43t%^25gf%d687";
		String str = input.replaceAll(regex, " ");
		System.out.println(str);
		
		str = input.replaceFirst(regex, " ");
		System.out.println(str);
	}
}
