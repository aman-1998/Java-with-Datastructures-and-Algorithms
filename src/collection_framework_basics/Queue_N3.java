package collection_framework_basics;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_N3 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(6); // add(5)
		queue.add(8);
		queue.add(33);
		queue.add(37);
		queue.add(84);
		queue.add(45);
		queue.add(12);
		queue.add(8);
		
		Display_Queue<Integer> disp = new Display_Queue<Integer>();
		
		System.out.println("Queue:-");
		disp.display2(queue);
		System.out.println("\n--------------------------------------------");
		
		int firstElement = queue.element(); // element()
		System.out.println(firstElement);
		System.out.println("\n--------------------------------------------");
		
		queue.remove();
		System.out.println("Queue:-");
		disp.display2(queue);
		System.out.println("\n--------------------------------------------");
		
		System.out.println(queue.isEmpty()); // isEmpty()
		System.out.println("\n--------------------------------------------");
		
		System.out.println(queue.size()); // size()
		System.out.println("\n--------------------------------------------");
		
		Queue<Integer> queue2 = new LinkedList<Integer>();
		queue2.add(5);
		System.out.println(queue.equals(queue2));
		System.out.println("\n--------------------------------------------");
		
		System.out.println(queue.contains(33)); // true()
		System.out.println("\n--------------------------------------------");
		
		queue.clear();
		System.out.println("Queue:-");
		disp.display2(queue);
		
	}
}
