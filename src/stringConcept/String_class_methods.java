package stringConcept;

public class String_class_methods {
	
	public static void main(String[] args)
	{
		String str = " Aman is an intelligent boy  ";
		System.out.println(str.length()); // length()
		str = str.trim();  // trim()
		System.out.println(str.length());
		str = " ";
		System.out.println(str.isEmpty());
		str = str.trim();
		System.out.println(str.isEmpty());  // isEmpty()
		String str1 = "Aman Kumar Mishra";
		String str2 = "Aman Kumar Mishra";
		String x = str1.equals(str2) ? "Yes" : "No";
		if(x.equals("Yes") == true)  // equals()
			System.out.println("str1 is equal to str2");
		else
			System.out.println("str1 is not equal to str2");
		
		String str3 = "Aman Kumar MiSHra";
		
		if(str3.equalsIgnoreCase(str2))  // equalsIgnoreCase()
			System.out.println("str3 and str2 are equal");
		else
			System.out.println("str3 and str2 are not equal");
		
		
		String str4 = "AMit";
		
		int check = str4.compareTo(str3);  // compareTo()
		System.out.println(check);
		
		check = str2.compareToIgnoreCase(str3);  // compareToIgnoreCase()
		System.out.println(check);
		
		String str5 = str4.concat(str3);  // concat()
		System.out.println(str5);
		
		String str6 = String.join("**", str4, "Kumar", "Mishra");  // String.join()
		System.out.println(str6);
		
		String str7 = str3.substring(3,15);  // substring(3,8)
		System.out.println(str7);
		
		str7 = str3.substring(2);  // substring(3)
		System.out.println(str7);
		
		String str8 = "This is a good car";
		
		str7 = str8.replace("is","was");  // replace()
		System.out.println(str7);
		
		str7 = str8.replaceFirst("is", "was");  // replaceFirst()
		System.out.println(str7);
		
		int i = str3.indexOf("iS");  // indexOf("is")
		System.out.println(i);
		
		i = str8.indexOf("is", 3);  // indexOf("is",fromint)
		System.out.println(i);
		
		i = str8.lastIndexOf("is");  // lastIndexOf("is")
		System.out.println(i);
		
		i = str8.lastIndexOf("is", 4);  // lastIndexOf("is",fromint)
		System.out.println(i);
		
		char ch = str8.charAt(6);  // charAt()
		System.out.println(ch);
		
		boolean test = str8.contains("ood");  // contains()
		System.out.println(test);
		
		String str9 = "d coar";
		test = str8.contains(str9);
		System.out.println(test);
		
		System.out.println(str9.startsWith("d"));  // startsWith()
		System.out.println(str9.endsWith("s"));  // endsWith()
		
		str8 = str8.toUpperCase();  // toUpperCase()
		System.out.println(str8);
		
		str8 = str8.toLowerCase();  // toLowerCase()
		System.out.println(str8);
		
		String number = String.valueOf(1274);  // String.valueOf()
		System.out.println(number);
		System.out.println(number instanceof String);
		System.out.println(number.getClass().getName());
		
		char[] arr = {'a','m','a','n'};
		int[] a = {2,3,8,9,0};
		
		char[] c = str9.toCharArray();  // toCharArray()
		System.out.println(c);
		System.out.println(arr);
		System.out.println(a);
		System.out.println("Array c :-");
		for(char j : c)
			System.out.println(j);
		
	}

}
