package practice.dsa.sheet.part1;

/*
 * 
 * Inorder successor of a given node in a BST.
 * In case the successor doesn't exist the value is -1.
 *
 */

class Node7 {
	
	int data;
	Node7 left;
	Node7 right;
	
	public Node7(int data) {
		this.data = data;
	}
}

public class InorderSuccessor_In_BST {
	
	public static void main(String[] args) {
		Node7 root = createBinaryTree();
		//Node7 p = new Node7(14);
		Node7 p = new Node7(28);
		Node7 inorderSuccessor = findSuccessor(root, p);
		System.out.println(inorderSuccessor.data);
	}
	
	private static Node7 createBinaryTree() {
		Node7 root = new Node7(28);
        root.left = new Node7(14);
        root.left.right = new Node7(11);
		return root;
	}
	
	// T = O(h)
	public static Node7 findSuccessor(Node7 root, Node7 p) {
		return findSuccessor(root, p, new Node7(-1));
	}
	
	public static Node7 findSuccessor(Node7 root, Node7 p, Node7 inorderSuccessor) {
		
		if(root == null) {
			return inorderSuccessor;
		}
		
		if(root.data > p.data) {
			return findSuccessor(root.left, p, root);
		} else {
			return findSuccessor(root.right, p, inorderSuccessor);
		}
	}
}
