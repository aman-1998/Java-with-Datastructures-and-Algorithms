package stringConcept;

public class String_revise_first {
	
	public static void main(String[] args)
	{
		String str1 = " Aman Kumar Mishra ";
		int len1 = str1.length();
		System.out.println(len1);
		str1 = str1.trim();
		int len2 = str1.length();
		System.out.println(len2);
		System.out.println(str1.isEmpty());
		String str2 = "Aman Kumar Mishra";
		System.out.println(str1+" "+str2);
		System.out.println(str1.equals(str2));
		String str3 = "aman kumar mishra";
		System.out.println(str2.equalsIgnoreCase(str3));
		String str4 = "Amit";
		System.out.println(str2.compareTo(str4));
		String str5 = "amiT";
		System.out.println(str4.compareToIgnoreCase(str5));
		String str6 = str4.concat(str5);
		System.out.println(str6);
		String str7 = "Hello";
		String str8 = "Hi";
		String str9 = "Byy";
		String str10 = "Shyy";
		String str11 = String.join("%", str7, str8, str9, str10, "Tyy");
		System.out.println(str11);
		String str12 = str2.substring(2,12);
		System.out.println(str12);
		String str13 = str2.substring(5);
		System.out.println(str13);
		String str14 = "I am feeling good";
		String str15 = str14.replace("am", "will be");
		System.out.println(str15);
		String str16 = "That is a fish";
		String str17 = str16.replaceFirst("is", "was");
		str16 = "That is a fish";
		System.out.println(str17);
		System.out.println(str2.indexOf("Ku"));
		System.out.println(str16.indexOf("is", 6));
		System.out.println(str16.lastIndexOf("is"));
		String str18 = "abcdbcedscabcecd";
		System.out.println(str18.lastIndexOf("cd", 5));
		System.out.println(str16.charAt(6));
		System.out.println(str18.contains("sca"));
		String str19 = "abcdefghijklmnopqrstuvwxyz";
		String str20 = str19.toUpperCase();
		System.out.println(str20);
		String str21 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str22 = str21.toLowerCase();
		System.out.println(str22);
		String str23 = String.valueOf(3.56);
		System.out.println(str23);
		System.out.println(str23 instanceof String);
		System.out.println(str23.getClass().getName());
		char[] c = {'A','m','a','n'};
		int[] arr = {3,4,5,6,8,1};
		System.out.println(c);
		System.out.println(arr);
		char[] ch = str21.toCharArray();
		System.out.println(str21);
		for(char i : ch)
			System.out.print(i+" ");
	}
}
