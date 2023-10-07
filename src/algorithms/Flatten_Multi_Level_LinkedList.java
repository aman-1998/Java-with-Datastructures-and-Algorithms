package algorithms;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
	
	public int data;
	public Node2 next;
	public Node2 down;
}

public class Flatten_Multi_Level_LinkedList {
	public static void main(String[] args) {
		Node2 start = createMultiLevelLinkedList();
		
		start = flattenMultiLevelLinkedList(start);
		
		// Print LinkedList after flattening it
		Node2 t = start;
		while(t != null) {
			System.out.println(t.data + " ");
			t = t.next;
		}
	}
	
	private static Node2 createMultiLevelLinkedList() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Brute Force approach
	 */
	//Time = O(n), Space = O(n)
	public static Node2 flattenMultiLevelLinkedList_BruteForce(Node2 start) {
		if(start == null) {
			return start;
		}
		Queue<Node2> queue = new LinkedList<>();
		Node2 t = start;
//		while(true) {
//			while(t.next != null) {
//				//System.out.println(t.data);
//				if(t.down != null) {
//					queue.add(t.down);
//					t.down = null;
//				}
//				t = t.next;
//			}
//			if(queue.isEmpty()) {
//				return start;
//			}
//			Node2 temp = queue.remove();
//			t.next = temp;
//		}
		
		while(true) {
			
			if(t.down != null) {
				queue.add(t.down);
			}
			
			if(t.next == null) {
				if(queue.isEmpty()) {
					return start;
				}
				Node2 temp = queue.remove();
				t.next = temp;
			}
			t = t.next;
			
		}
	}
	
	public static Node2 flattenMultiLevelLinkedList(Node2 start) {
		if(start == null) {
			return start;
		}
		
		Node2 t = start;
		Node2 d = start;
		while(true) {
			if(t.next == null) {
				while(d.down == null) {
					d = d.next;
					if(d == null) {
						return start;
					}
				}
				t.next = d.down;
				d.down = null; // Not mandatory
				d = d.next;
			}
			t = t.next;
		}
	}
}
