package collectionFrameWork.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_MinHeap {
	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		minHeap.add(16); // add or insert
		minHeap.add(13);
		minHeap.add(10);
		minHeap.add(14);
		minHeap.add(8);
		minHeap.add(4);
		minHeap.add(9);
		
		Iterator<Integer> ite = minHeap.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		System.out.println("\n------------------------------");
		
		System.out.println(minHeap.remove()); // delete min
		System.out.println("\n------------------------------");
		
		ite = minHeap.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		
		System.out.println("\n------------------------------");
		System.out.println(minHeap.poll()); // delete min
		System.out.println("\n------------------------------");
		
		System.out.println("Heap size = "+minHeap.size());
	}
}
