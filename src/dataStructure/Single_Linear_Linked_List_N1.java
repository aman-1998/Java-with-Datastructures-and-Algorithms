package dataStructure;

import java.util.Scanner;

class Node {
	private int info;
	private Node node;
	
	public Node(int info, Node node) {
		this.info = info;
		this.node = node;
	}
	
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
}

public class Single_Linear_Linked_List_N1 {
	public static void main(String[] args) {
		Node start = null;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("Enter your choice: ");
			int ch = in.nextInt();
			boolean stop = false;
			switch(ch) {
				case 1:
					System.out.print("Enter a value to add at the end: ");
					int endVal = in.nextInt();
					start = addLast(start, endVal);
					break;
				case 2:
					System.out.print("Enter a value to add in the beginning: ");
					int firstVal = in.nextInt();
					start = addFirst(start, firstVal);
					break;
				case 3:
					System.out.print("Enter the value after which you want to add and the value to be added respectively: ");
					int existingVal = in.nextInt();
					int afterVal = in.nextInt();
					start = addAfter(start, existingVal, afterVal);
					break;
				case 4:
					System.out.print("Enter the value before which you want to add and the value to be added respectively: ");
					int existingValue = in.nextInt();
					int beforeVal = in.nextInt();
					start = addBefore(start, existingValue, beforeVal);
					break;
				case 5:
					System.out.println("Enter the position where you want to add and the number to be added respectively: ");
					int pos = in.nextInt();
					int particularVal = in.nextInt();
					start = addAtParticularPos(start, pos, particularVal);
					break;
				case 6:
					start = deleteFirst(start);
					break;
				case 7:
					start = deleteLast(start);
					break;
				case 8:
					System.out.print("Enter the value after which you want to delete: ");
					int delAf = in.nextInt();
					start = deleteAfter(start, delAf);
					break;
				case 9:
					System.out.print("Enter the value before which you want to delete: ");
					int delBef = in.nextInt();
					start = deleteBefore(start, delBef);
					break;
				case 10:
					System.out.print("Enter the value to be deleted: ");
					int parVal = in.nextInt();
					start = deleteParticular(start, parVal);
					break;
				case 11:
					stop = true;
				default:
					display(start);
			}
			
			if(stop == true) {
				break;
			}
		}
	}

	private static Node deleteBefore(Node start, int delBef) {
		if(start == null) {
			System.out.println("LinkedLst is empty");
			return start;
		}
		
		if(start.getNode().getInfo() == delBef) {
			start = deleteFirst(start);
			return start;
		}
		
		Node temp = start;
		while(temp.getNode().getNode() != null) {
			if(temp.getNode().getNode().getInfo() == delBef) {
				start = deleteAfter(start, temp.getInfo());
				break;
			}
			temp = temp.getNode();
		}
		return start;
	}

	private static Node deleteAfter(Node start, int delAf) {
		if(start == null) {
			System.out.println("LinkedList is empty");
			return start;
		}
		
		Node temp = start;
		while(temp != null) {
			if(temp.getInfo() == delAf) {
				if(temp.getNode() == null) {
					System.out.println("Can't delete after last element");
					return start;
				}
				temp.setNode(temp.getNode().getNode());
				return start;
			}
			temp = temp.getNode();
		}
		return start;
	}
	
	private static Node deleteParticular(Node start, int particularVal) {
		if(start == null) {
			System.out.println("LinkedList is empty");
			return start;
		}
		
		if(start.getInfo() == particularVal) {
			start = deleteFirst(start);
			return start;
		}
		
		Node temp = start;
		while(temp.getNode() != null) {
			if(temp.getNode().getInfo() == particularVal) {
				temp.setNode(temp.getNode().getNode());
				return start;
			}
			temp = temp.getNode();
		}
		return start;
	}

	private static Node addLast(Node start, int endVal) {
		if(start == null) {
			start = new Node(endVal, null);
			return start;
		}
		
		Node temp = start;
		while(temp.getNode() != null) {
			temp = temp.getNode();
		}
		
		Node lastNode = new Node(endVal, null);
		temp.setNode(lastNode);
		return start;
	}
	
	private static Node addFirst(Node start, int firstVal) {
		if(start == null) {
			start = new Node(firstVal, null);
			return start;
		}
		
		Node temp = new Node(firstVal, start);
		start = temp;
		return start;
	}
	
	private static Node addAfter(Node start, int existingVal, int afterVal) {
		if(start == null) {
			System.out.println("LinkedList is empty");
			return start;
		}
		
		Node temp = start;
		while(temp != null) {
			if(temp.getInfo() == existingVal) {
				Node newNode = new Node(afterVal, temp.getNode());
				temp.setNode(newNode);
				break;
			}
			temp = temp.getNode();
		}
		return start;
	}
	
	private static Node addBefore(Node start, int existingValue, int beforeVal) {
		if(start == null) {
			System.out.println("LinkedList is empty");
			return start;
		}
		
		if(start.getInfo() == existingValue) {
			start = addFirst(start, beforeVal);
			return start;
		}
		
		Node temp = start;
		while(temp.getNode() != null) {
			if(temp.getNode().getInfo() == existingValue) {
				start = addAfter(start, temp.getInfo(), beforeVal);
				return start;
			}
			temp = temp.getNode();
		}
		return start;
	}
	
	private static int noOfNode(Node start) {
		if(start == null) {
			return 0;
		}
		
		int count = 0;
		while(start != null) {
			count++;
			start = start.getNode();
		}
		return count;
	}
	
	private static Node addAtParticularPos(Node start, int pos, int particularVal) {
		if(start == null) {
			System.out.println("LinkedList is empty");
			return start;
		}
		Node counter = start;
		int count = 0;
		while(counter != null) {
			count++;
			if(count == pos) {
				start = addAfter(start, counter.getInfo(), particularVal);
				break;
			}
			counter = counter.getNode();
		}
		return start;
	}
	
	private static Node deleteFirst(Node start) {
		if(start == null) {
			System.out.println("LinkedList is empty");
			return start;
		}
		start = start.getNode();
		return start;
	}
	
	private static Node deleteLast(Node start) {
		if(start == null) {
			System.out.println("LinkedList is empty");
			return start;
		}
		
		if(noOfNode(start) == 1) {
			return null;
		}
		
		Node temp = start;
		while(temp.getNode().getNode() != null) {
			temp = temp.getNode();
		}
		temp.setNode(null);
		return start;
	}

	private static void display(Node start) {
		if(start == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		
		Node counter = start;
		while(counter != null) {
			System.out.print(counter.getInfo() + " | ");
			counter = counter.getNode();
		}
	}
}
