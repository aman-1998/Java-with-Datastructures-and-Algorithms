package algorithms.part1;

class Node5 {
	
	int data;
	Node5 next;
	
	public Node5(int data) {
		this.data = data;
	}
}

public class Add_Two_Numbers_As_Lists {
	
	public static void main(String[] args) {
		
		Node5 head1 = createLinkedList();
		Node5 head2 = createLinkedList();
		
		Node5 sumHead = addTwoNumbers(head1, head2);
	}
	
	private static Node5 createLinkedList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// T = O(min(m, n))
	// S = O(1)
	private static Node5 addTwoNumbers(Node5 head1, Node5 head2) {
		
		int carry = 0;
		Node5 t1 = head1;
		Node5 t2 = head2;
		Node5 head3 = null;
		Node5 prev = null;
		
		while(t1 != null || t2 != null || carry != 0) {
			
			int sum = 0;
			if(t1 != null) {
				sum = sum + t1.data;
				t1 = t1.next;
			}
			
			if(t2 != null) {
				sum = sum + t2.data;
				t2 = t2.next;
			}
			
			sum = sum + carry;
			Node5 t3 = new Node5(sum % 10);
			carry = sum / 10;
			if(prev != null) {
				prev.next = t3;
			} else {
				head3 = t3;
			}
			prev = t3;
			
		}
		
		return head3;
	}
}
