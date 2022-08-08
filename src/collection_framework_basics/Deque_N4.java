package collection_framework_basics;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_N4 {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.add("Aman"); // add("Aman")
		deque.add("Namrata");
		deque.add("Sakshi");
		deque.add("Tanisha");
		deque.add("Amit");
		deque.add("Pintu");
		
		Display_Queue<String> disp = new Display_Queue<String>();
		System.out.println("Deque:-");
		disp.display2(deque);
		System.out.println("\n------------------------------------------");
		
		deque.addFirst("Kunal"); // addFirst("Pallav")
		System.out.println("Deque:-");
		disp.display1(deque);
		System.out.println("\n------------------------------------------");
		
		deque.addLast("Harpreet"); // addLast("Raj")
		System.out.println("Deque:-");
		disp.display2(deque);
		System.out.println("\n------------------------------------------");
		
		deque.removeFirst(); // removeFirst()
		deque.removeLast(); // removeLast()
		System.out.println("Deque:-");
		disp.display2(deque);
		System.out.println("\n------------------------------------------");
		
		System.out.println(deque.isEmpty()); // isEmpty()
		System.out.println(deque.peekFirst()); // peekFirst()
		System.out.println(deque.peekLast()); // peekLast()
		System.out.println(deque.size()); // size()
	}
}
