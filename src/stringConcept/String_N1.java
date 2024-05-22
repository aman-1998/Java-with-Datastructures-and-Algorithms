package stringConcept;

public class String_N1 
{
	public static void main(String[] args)
	{
		String str1 = "Aman Kumar Mishra";
		int len = str1.length(); // length()
		System.out.println(len);
		String str2 = " Aman  ";
		String str3 = str2.trim(); // trim()
		System.out.println(str3);
		String str4 = "";
		boolean check1 = str4.isEmpty(); // isEmpty()
		System.out.println(check1);
		String str5 = "Amit";
		System.out.println(str5.charAt(2)); // charAt(3)
		String str6 = "Radha";
		String str7 = str6.concat(" Jha"); // concat("aman")
		System.out.println(str7);
		String str8 = "My name is Aman Kumar Mishra";
		System.out.println(str8.contains("is")); // contains("is")
		String str9 = String.join("//", "Binod", "Kumar", "Chaudhry"); // join()
		System.out.println(str9);
		String str10 = String.valueOf(134.7); // valueOf()
		System.out.println(str10);
		String str11 = "anuja";
		String str12 = "anuja";
		System.out.println(str11.equals(str12)); // equals()
		String str13 = "Anuja";
		System.out.println(str13.equalsIgnoreCase(str12)); // equalsIgnoreCase()
		String str14 = "Amit";
		String str15 = "Amitaf";
		System.out.println(str14.compareTo(str15)); // compareTo()
		String str16 = "babu";
		String str17 = "Babu";
		System.out.println(str16.compareToIgnoreCase(str17)); // compareToIgnoreCase()
		String str18 = "Mala is rich. And she is miser";
		String str19 = str18.replace("is", "was"); // replace()
		System.out.println(str19);
		String str20 = "Bittu is clever. And he is kind";
		String str21 = str20.replaceFirst("is", "was"); // replaceFirst()
		System.out.println(str21);
		String str22 = "Mai tera Hero";
		String str23 = str22.substring(2); // substring(2)
		System.out.println(str23);
		String str24 = str22.substring(4,10); // substring(2,7)
		System.out.println(str24);
		String str25 = "aman";
		System.out.println(str25.toUpperCase()); // toUpperCase()
		String str26 = "RADHA";
		System.out.println(str26.toLowerCase()); // toLowerCase()
		String str27 = "Raghupati Raghaw";
		System.out.println(str27.startsWith("Rag")); //startsWith()
		System.out.println(str27.endsWith("ghaw")); // endsWith()
		System.out.println(str27.indexOf("Ra")); // indexOf("Ra")
		System.out.println(str27.indexOf("Ra", 7)); // indexOf("Ra", 7)
		System.out.println(str27.lastIndexOf("gh")); // lastIndexOf("gh")
		System.out.println(str27.lastIndexOf("gh",10)); // lastIndexOf("gh",10)
		
	}
}
