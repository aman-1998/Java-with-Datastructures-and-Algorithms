package algorithms;

class Node4 {
	public int data;
	public Node4 link;
}

public class Intersection_of_Linked_Lists {
	public static void main(String[] args) {
		
	}
	
	public static Node4 intersectionPoint(Node4 start1, Node4 start2) {
		
		if(start1 == null || start2 == null) {
			return null;
		}
		
		Node4 t1 = start1;
		Node4 t2 = start2;
		
		while(t1 != t2) {
			
			if(t1 == null) {
				t1 = start2;
			}
			
			if(t2 == null) {
				t2 = start1;
			}
			
			t1 = t1.link;
			t2 = t2.link;
		}
		
		return t1;
	}
}
