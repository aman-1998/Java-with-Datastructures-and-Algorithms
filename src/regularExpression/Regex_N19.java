package regularExpression;

public class Regex_N19 
{
	public static void main(String[] args)
	{
		String regex = "([[A-Z][a-z]]+)(\\d+)([[A-Z][a-z]]+)";
		String input = "@$@sdsd5g534#$%$#FNGFGrge6432dgd#%5f";

		String str = input.replaceAll(regex, "Aman");
		System.out.println(str);
		
		str = input.replaceFirst(regex, "Aman");
		System.out.println(str);
	}
}
