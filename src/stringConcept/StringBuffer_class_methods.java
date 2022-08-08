package stringConcept;

import java.util.Scanner;

public class StringBuffer_class_methods {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		StringBuffer sb1 = new StringBuffer("  Aman is a good boy ");
		System.out.println(sb1.capacity());
		StringBuffer sb2 = new StringBuffer(4);
		System.out.println(sb2.capacity());  // capacity() : int
		// sb2 = "Aman"  // not possible - type mismatch
		System.out.print("Enter a stringbuffer : ");
		sb2 = sb2.append(in.nextLine());
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());  // length() : int
		/*
		char[] c = {'S','r','i',' ','C','h','a','i','t','a','n','y','a'};
		StringBuffer sb3 = new StringBuffer(c);
		*/
		String str1;
		System.out.print("Enter any string : ");
		str1 = in.nextLine();
		StringBuffer sb3 = new StringBuffer(str1);
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		System.out.println(sb1);
		sb1.trimToSize();
		System.out.println(sb1);
		
		sb3.trimToSize();  // trimToSize() : void
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		
		sb3.ensureCapacity(20); // ensureCapacity() : void
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		
		StringBuffer sb4 = new StringBuffer("This is a very good book");
		
		StringBuffer sb5 = sb4.delete(3, 10);  // delete(3,10) : StringBuffer
		System.out.println(sb5);
		System.out.println(sb4);
		
		sb4.deleteCharAt(12);  // deleteCharAt(5) : StringBuffer
		System.out.println(sb4);
		
		StringBuffer sb6 = new StringBuffer("Ee kya bolti tu");
		sb6.setCharAt(8, 'P');  // setCharAt() : void
		System.out.println(sb6);
		
		StringBuffer sb7 = new StringBuffer();
		sb7 = sb7.append(sb6);
		sb7 = sb7.append(" Kumar");  // append() : StringBuffer
		System.out.println(sb7);
		
		StringBuffer sb8 = sb6.insert(5, "ABC");  // insert(5,"abc") : StringBuffer
		System.out.println(sb8);
		
		
		StringBuffer sb9 = new StringBuffer("Haye ni mera ji karda");
		sb9.reverse();
		System.out.println(sb9);
		sb9 = sb9.reverse();
		System.out.println(sb9);
		
		sb9.replace(5,7,"ji");
		System.out.println(sb9);
		sb9.replace(5,6,"n");
		System.out.println(sb9);
		String sb10 = sb9.substring(3);  // substring(3) : String
		System.out.println(sb10);
		System.out.println(sb9);
		
		String sb11 = sb9.substring(3,6);  // substring(3,8) : String
		System.out.println(sb11);
		
		int i = sb9.indexOf("ni");  // indexOf("A");
		System.out.println(i);
		
		i = sb9.indexOf("a",10);  // indexOf("abc",5)
		System.out.println(i);
		
		i = sb9.lastIndexOf("i");  // lastIndexOf("as")
		System.out.println(i);
		
		i = sb9.lastIndexOf("i",13);  // lastIndexOf("asds",7)
		System.out.println(i);
		
		char ch = sb9.charAt(9);  // charAt()
		System.out.println(ch);
		
		System.out.println(sb9.getClass().getName());
		String str = sb9.toString();  // toString()
		System.out.println(str);
		System.out.println(str.getClass().getName());
		System.out.println(str instanceof String);
		
	}
}
