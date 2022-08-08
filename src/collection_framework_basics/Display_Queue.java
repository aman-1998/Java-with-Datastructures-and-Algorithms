package collection_framework_basics;

import java.util.Iterator;
import java.util.Queue;

public class Display_Queue<T> {
	
	public void display1(Queue<T> queue) {
		Iterator<T> ite = queue.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
	}
	
	public void display2(Queue<T> queue) {
		for(Iterator<T> ite = queue.iterator(); ite.hasNext();) {
			System.out.print(ite.next() + " ");
		}
	}
	
	public void display3(Queue<T> queue) {
		for(T element : queue) {
			System.out.println(element + " ");
		}
	}
}
