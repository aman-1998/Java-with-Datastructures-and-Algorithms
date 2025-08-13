package practice.dsa.sheet.part1;

class Node {
	public int data;
	public Node link;
}

public class Reverse_Linked_List {
	public static void main(String[] args) {
		Node start = createLinkedList();
		
		start = reverseLinkedList(start);
		
		// Print LinkedList
		Node t = start;
		while(t != null) {
			System.out.println(t.data + " ");
			t = t.link;
		}
	}
	
	private static Node createLinkedList() {
		// TODO Auto-generated method stub
		return null;
	}

	//Time = O(n)
	public static Node reverseLinkedList(Node start) {
		if(start == null) {
			return start;
		}
		
		Node prev = null;
		Node next = null;
		Node t = start;
		
		while(t != null) {
			next = t.link;
			t.link = prev;
			prev = t;
			t = next;
		}
		
		start = prev;
		return start;
	}
}
