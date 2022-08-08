package collection_framework_basics;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_N2 {
	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Aman"); // add("aman")
		lst.add("Hrishav");
		lst.add("Madhav");
		lst.add("Akash");
		lst.add("Amit");
		lst.add("Manoj");
		
		Display_List<String> disp = new Display_List<String>();
		System.out.println("LinkedList:-");
		disp.display1(lst);
		System.out.println("\n----------------------------------------");
		
		lst.add(2,"Manshi"); // add(3,"deepak")
		System.out.println("LinkedList:-");
		disp.display1(lst);
		System.out.println("\n----------------------------------------");
		
		lst.set(1,"Ravi"); // set(2,"Ravi")
		System.out.println("LinkedList:-");
		disp.display1(lst);
		System.out.println("\n----------------------------------------");
		
		lst.addFirst("Girish"); // addFirst("Alok")
		System.out.println("LinkedList:-");
		disp.display1(lst);
		System.out.println("\n----------------------------------------");
		
		lst.addLast("Ram"); // addLast("Manav")
		System.out.println("LinkedList:-");
		disp.display1(lst);
		System.out.println("\n----------------------------------------");
		
		boolean check = lst.contains("Ravindra");
		System.out.println(check);
		System.out.println("\n----------------------------------------");
		
		int i = lst.indexOf("Amit"); // indexOf("Amit")
		System.out.println(i);
		System.out.println("\n----------------------------------------");
		
		i = lst.lastIndexOf("Amit"); // lastIndexOf("Amit")
		System.out.println(i);
		System.out.println("\n----------------------------------------");
		
		String element = lst.get(5); // get(5)
		System.out.println(element);
		System.out.println("\n----------------------------------------");
		
		int size = lst.size(); // size()
		System.out.println(size);
		System.out.println("\n----------------------------------------");
		
		check = lst.isEmpty(); // isEmpty()
		System.out.println(check);
		System.out.println("\n----------------------------------------");
		
		lst.remove(2); // remove(2)
		System.out.println("LinkedList:-");
		disp.display1(lst);
		System.out.println("\n----------------------------------------");
		
		lst.remove("Manshi"); // remove("Aman")
		System.out.println("LinkedList:-");
		disp.display2(lst);
		System.out.println("\n----------------------------------------");
		
		lst.removeFirst(); // removeFirst()
		lst.removeLast(); // removeLast()
		System.out.println("LinkedList:-");
		disp.display2(lst);
		System.out.println("\n----------------------------------------");
		
		element = lst.peekFirst(); // peekFirst()
		System.out.println(element);
		element = lst.peekLast(); // peekLast()
		System.out.println(element);
		System.out.println("\n----------------------------------------");
		
		String str = lst.toString(); // toString
		System.out.println(str);
		System.out.println("\n----------------------------------------");
		
		LinkedList<String> lst2 = (LinkedList<String>) lst.clone(); // clone()
		System.out.println("LinkedList:-");
		disp.display1(lst2);
		System.out.println("\n----------------------------------------");
		
		System.out.println(lst.equals(lst)); // equals()
		System.out.println("\n----------------------------------------");
		
		Collections.sort(lst);
		System.out.println("LinkedList:-");
		disp.display2(lst);
		System.out.println("\n----------------------------------------");
		
		Collections.reverse(lst);
		System.out.println("LinkedList:-");
		disp.display2(lst);
	}
}
