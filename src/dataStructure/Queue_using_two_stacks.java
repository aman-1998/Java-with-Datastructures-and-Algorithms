package dataStructure;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Queue_using_two_stacks {
	public static void main(String[] args) {
		LinkedList<Integer> stack1 = new LinkedList<>();
		LinkedList<Integer> stack2 = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		boolean stop = false;
		while(true) {
			System.out.print("Enter your choice: ");
			int ch = in.nextInt();
			switch(ch) {
				case 1:
					System.out.print("Enter the integer to be enqueued: ");
					int valToBePushed = in.nextInt();
					stack1.add(valToBePushed);
					break;
				case 2:
					Integer val = 0;
					if(stack2.isEmpty()) {
						while(!stack1.isEmpty()) {
							val = stack1.removeLast();
							stack2.add(val);
						}
						try {
						val = stack2.removeLast();
						} catch (NoSuchElementException ex) {
							System.out.println("Queue is empty");
							break;
						}
						System.out.println(val + " is dequeued");
					} else {
						val = stack2.removeLast();
						System.out.println(val + " is dequeued");
					}
					break;
				case 3:
					stop = true;
				case 4:
					for(ListIterator<Integer> ite = stack2.listIterator(stack2.size()); ite.hasPrevious();) {
						System.out.print(ite.previous() + " | ");
					}
					for(ListIterator<Integer> ite = stack1.listIterator(); ite.hasNext();) {
						System.out.print(ite.next() + " | ");
					}
					System.out.println();
					break;
				default:
					System.out.println("Wrong choice");
			}
			
			if(stop == true) {
				break;
			}
		}
	}
}
