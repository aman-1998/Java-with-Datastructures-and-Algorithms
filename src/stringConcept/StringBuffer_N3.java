package stringConcept;

import java.util.Scanner;

public class StringBuffer_N3 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter any string: ");
		String str = in.nextLine();
		StringBuffer sb = new StringBuffer(str);
		System.out.println(str);
		System.out.println(sb.capacity()); // capacity() : int
		System.out.println(sb.length()); // length() : int
		sb = new StringBuffer(" Aman Kumar Mishra  ");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.trimToSize(); // trimToize() : void
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb = new StringBuffer("Aman");
		System.out.println(sb.capacity());
		sb.ensureCapacity(25); // ensureCapacity() : void
		System.out.println(sb.capacity());
		sb = new StringBuffer("AMAN mIsHrA");
		System.out.println(sb.charAt(5)); // charAt() : char
		sb.setCharAt(5,'M'); // setCharAt() : void
		System.out.println(sb);
		sb.deleteCharAt(4); // deleteCharAt() : void
		System.out.println(sb);
		sb = new StringBuffer("Aman Chattopadhyay");
		sb.delete(7, 12); // delete() : void
		System.out.println(sb);
		sb = new StringBuffer("Select * from EMPLOYEE as emp ");
		sb.append("where emp.emp_id = "+123); // append() : void
		sb = new StringBuffer("Aman ar Mishra");
		System.out.println(sb);
		sb.insert(5, "Kum"); // insert() : void
		System.out.println(sb);
		sb = new StringBuffer("He is a good boy");
		int i = sb.indexOf("ood"); // indexOf("is") : int
		System.out.println(i);
		int j = sb.indexOf("o", 11); // indexOf("is", 10) : int
		System.out.println(j);
		int k = sb.lastIndexOf("o"); // lastIndexOf("is") : int
		System.out.println(k);
		int l = sb.lastIndexOf("o", 13); // lastIndexOf("is", 13) : int
		System.out.println(l);
		sb = new StringBuffer("Hello World");
		String sb1 = sb.substring(2); // substring(2) : String
		System.out.println(sb1);
		sb1 = sb.substring(2,5); // substring(2,5) : String
		System.out.println(sb1);
		String str1 = sb.toString(); // toString() : String
		System.out.println(str1);
	}
}
