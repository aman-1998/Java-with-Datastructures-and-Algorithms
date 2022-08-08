package stringConcept;

import java.util.Scanner;

public class StringBuffer_revise {
	
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Aman Kumar Mishra");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		StringBuffer sb1 = new StringBuffer();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any string: ");
		sb1 = sb1.append(in.nextLine());
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer(4);
		System.out.println("Enter any string: ");
		String str = in.nextLine();
		sb2.append(str);
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(20);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		sb2.trimToSize();
		System.out.println(sb2.length());
		StringBuffer sb3 = new StringBuffer("Why are you so ugly ?");
		StringBuffer sb4 = sb3.delete(5,13);
		System.out.println(sb4);
		StringBuffer sb5 = new StringBuffer("I don't know what to do ?");
		StringBuffer sb6 = sb5.deleteCharAt(5);
		System.out.println(sb6);
		String str1 = "Dil kyu ye mera shor kare ?";
		StringBuffer sb7 = new StringBuffer();
		sb7 = sb7.append(str1);
		StringBuffer sb8 = sb7.replace(4, 7, "aman");
		System.out.println(sb8);
		StringBuffer sb9 = new StringBuffer("Mera naam hai chin chin chu");
		sb9.setCharAt(6, 'A');
		sb9.insert(26, "UU");
		System.out.println(sb9);
		sb9.reverse();
		System.out.println(sb9);
		StringBuffer sb10 = new StringBuffer("Kya hua tera wada ?");
		System.out.println(sb10.charAt(9));
		StringBuffer sb11 = new StringBuffer("Just testing");
		System.out.println(sb11.indexOf("t"));
		System.out.println(sb11.indexOf("t",6));
		System.out.println(sb11.lastIndexOf("t"));
		System.out.println(sb11.lastIndexOf("t",6));
		StringBuffer sb12 = new StringBuffer("Mai koi aisa geet gaaun");
		String str2 = sb12.substring(4);
		System.out.println(str2);
		String str3 = sb12.substring(8,12);
		System.out.println(str3);
		StringBuffer sb13 = new StringBuffer("Avinash");
		System.out.println(sb13.getClass().getName());
		System.out.println(sb13);
		String str4 = sb13.toString();
		System.out.println(str4.getClass().getName());
		System.out.println(str4);
		
	}

}
