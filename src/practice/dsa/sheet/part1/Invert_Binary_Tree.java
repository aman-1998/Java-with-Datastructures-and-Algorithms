package practice.dsa.sheet.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Node6 {
	
	int data;
	Node6 left;
	Node6 right;
	
	public Node6(int data) {
		this.data = data;
	}
}

public class Invert_Binary_Tree {
	
	public static void main(String[] args) {
		Node6 root = createBinaryTree();
		root = invertBinaryTree(root);
		levelOrderTraversal2(root);
	}

	private static Node6 createBinaryTree() {
		
		Node6 root = new Node6(28);
        root.left = new Node6(14);
        root.right = new Node6(11);
        //root.left.left = new Node6(4);
        root.left.right = new Node6(48);
		
		return root;
	}

	private static void levelOrderTraversal1(Node6 root) {
		
		ArrayList<String> result = new ArrayList<>();
		Queue<Node6> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node6 t = queue.remove();
			if(t == null) {
				result.add("#");
			} else {
				result.add(String.valueOf(t.data));
				queue.add(t.left);
				queue.add(t.right);
			}
		}
		
		int flag = 1;
		ArrayList<String> finalResult = new ArrayList<>();
		for(int i = result.size() -1; i >= 0 ; i--) {
			if(result.get(i) == "#" && flag == 1) {
				continue;
			} else {
				finalResult.add(result.get(i).equals("#") ? "-1" : result.get(i));
				flag++;
			}
		}
		
		Collections.reverse(finalResult);
		finalResult.forEach(t -> System.out.print(t + " "));
	}
	
	private static void levelOrderTraversal2(Node6 root) {
		
		Queue<Node6> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node6 t = queue.remove();
			if(t != null) {
				System.out.print(t.data + " ");
				queue.add(t.left);
				queue.add(t.right);
			}
		}
	}
	
	private static Node6 invertBinaryTree(Node6 root) {
		
		if(root == null) {
			return root;
		} else if(root.left == null && root.right == null) {
			return root;
		} else {
			Node6 temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		invertBinaryTree(root.left);
		invertBinaryTree(root.right);
		return root;
	}
}
