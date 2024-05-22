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
		
		Pair removed1 = queue.remove();
		Pair removed2 = queue.remove();
		Pair removed3 = queue.remove();
		Pair removed4 = queue.remove();
		Pair removed5 = queue.remove();
		Pair removed6 = queue.remove();
		
		System.out.println(removed1.x + " | " + removed1.y);
		System.out.println(removed2.x + " | " + removed2.y);
		System.out.println(removed3.x + " | " + removed3.y);
		System.out.println(removed4.x + " | " + removed4.y);
		System.out.println(removed5.x + " | " + removed5.y);
		System.out.println(removed6.x + " | " + removed6.y);
		
//		for(Pair p : queue) {
//			System.out.println(p.x +" | " + p.y);
//		}
	}
}
