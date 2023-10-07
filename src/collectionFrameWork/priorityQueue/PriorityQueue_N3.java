package collectionFrameWork.priorityQueue;

import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
	public int x;
	public int y;
	
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Pair that) {
		return this.y - that.y;
	}
	
	
}

public class PriorityQueue_N3 {
	
	public static void main(String[] args) {
		PriorityQueue<Pair> queue = new PriorityQueue<>();
		
		queue.add(new Pair(9, 6));
		queue.add(new Pair(3, 18));
		queue.add(new Pair(0, 8));
		queue.add(new Pair(1, 8));
		queue.add(new Pair(1,5));
		
		queue.add(new Pair(1, 4));
		
		Pair removed = queue.remove();
		
		System.out.println(removed.x + " | " + removed.y);
		
//		for(Pair p : queue) {
//			System.out.println(p.x +" | " + p.y);
//		}
	}
}
