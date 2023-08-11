package algorithms;

class Node1 {
	public int data;
	public Node1 link;
}

public class Remove_Loop_From_LinkedList {
	
	static Node1 startingNodeOfLoop = null;
	
	public static void main(String[] args) {
		Node1 start = createLinkedList();
		
		Node1 meet = detectLoop(start);
		if(meet == null) {
			System.out.println("There is no loop");
		} else {
			System.out.println("There is loop present");
		}
		
		if(meet != null) { // If there is loop
			start = removeLoop(start);
			System.out.println("The node from which loop starts = " + startingNodeOfLoop.data);
		}
		
		// Print LinkedList after removing loop
		Node1 t = start;
		while(t != null) {
			System.out.println(t.data + " ");
			t = t.link;
		}
		
	}
	
	private static Node1 createLinkedList() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * if loop exist then returns the Node where fast and slow meets
	 * if there is no loop then return null 
	 */
	public static Node1 detectLoop(Node1 start) {
		
		if(start==null) {
			return null;
		}
		
		Node1 fast = start;
		Node1 slow = start;
		
		while(fast != null && fast.link != null) {
			slow = slow.link;
			fast = fast.link.link;
			if(slow == fast) {
				return slow;
			}
		}
		
		return null;
	}
	
	public static Node1 removeLoop(Node1 start) {
		
		if(start == null) {
			return start;
		}
		
		Node1 meet = detectLoop(start);
		Node1 t = start;
		
		while(t.link != meet.link) {
			t = t.link;
			meet = meet.link;
		}
		
		meet.link = null; // Loop removed
		startingNodeOfLoop = t;
		return start;
	}
}
