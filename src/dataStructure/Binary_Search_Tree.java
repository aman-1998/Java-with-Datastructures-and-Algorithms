package dataStructure;

import java.util.Scanner;

class Node1 {
	private int info;
	private Node1 leftNode;
	private Node1 rightNode;
	
	public Node1(int info, Node1 leftNode, Node1 rightNode) {
		this.info = info;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node1 getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node1 leftNode) {
		this.leftNode = leftNode;
	}

	public Node1 getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node1 rightNode) {
		this.rightNode = rightNode;
	}

	@Override
	public String toString() {
		return String.valueOf(info);
	}
}

public class Binary_Search_Tree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node1 root = null;
		boolean stop = false;
		while(true) {
			System.out.print("\nEnter your choice: ");
			int ch = in.nextInt();
			switch(ch) {
				case 1:
					System.out.print("\nEnter the value to be inserted: ");
					int val = in.nextInt();
					root = insert(root, val);
					break;
				case 2:
					System.out.print("Inorder: ");
					inorder(root);
					break;
				case 3:
					System.out.print("Preorder: ");
					preorder(root);
					break;
				case 4:
					System.out.print("Postorder: ");
					postorder(root);
					break;
				case 5:
					int countOfLeaves = noOfLeaves(root);
					System.out.println("No. of leaves = "+countOfLeaves);
					break;
				case 6:
					int countOfFullNodes = noOfFullNodes(root);
					System.out.println("No. of full nodes = "+countOfFullNodes);
					break;
				case 7:
					int countOfHalfNodes = noOfHalfNodes(root);
					System.out.println("No. of half nodes = "+countOfHalfNodes);
					break;
				case 8:
					int countOfTotalNodes = noOfTotalNodes(root);
					System.out.println("Total no. of nodes = "+countOfTotalNodes);
					break;
				case 9:
					int height = heightOfBinaryTree(root);
					System.out.println("Height = "+height);
					break;
				case 10:
					Integer max = maxInBST(root);
					if(max != null) {
						System.out.println("Maximum value in the BST = "+max);
					} else {
						System.out.println("BST is empty");
					}
					break;
				case 11:
					Integer min = minInBST(root);
					if(min != null) {
						System.out.println("Maximum value in the BST = "+min);
					} else {
						System.out.println("BST is empty");
					}
					break;
				case 12:
					System.out.println("Enter the value to be deleted: ");
					int valueToBeDeleted = in.nextInt();
					root = delete(root, valueToBeDeleted);
					break;
				case 13:
					boolean checkComplete = isComplete(root);
					if(checkComplete == false) {
						System.out.println("Not a complete binary tree");
					} else {
						System.out.println("Complete binary tree");
					}
					break;
				case 14:
					boolean checkFull = isFull(root);
					if(checkFull == false) {
						System.out.println("Not a full binary tree");
					} else {
						System.out.println("Full binary tree");
					}
					break;
				case 15:
					stop = true;
					break;
				default:
					System.out.println("Wrong choice !!");
			}
			
			if(stop == true) {
				break;
			}
		}
	}
	
	private static boolean isFull(Node1 root) {
		if(root == null) {
			return false;
		} else {
			int countOfLeaves = noOfLeaves(root);
			return (countOfLeaves & (countOfLeaves-1)) == 0 ?  isComplete(root) : false;
		}
	}

	private static boolean isComplete(Node1 root) {
		if(root == null) {
			return false;
		} else if(root.getLeftNode() == null && root.getRightNode() == null) {
			return true;
		} else if(root.getLeftNode() != null && root.getRightNode() != null) {
			return isComplete(root.getLeftNode()) && isComplete(root.getRightNode());
		} else {
			return false;
		}
	}
	
	private static Node1 delete(Node1 root, int val) {
		if(root == null) {
			return root;
		} else {
			if(root.getInfo() == val) {
				// leaf node
				if(root.getLeftNode() == null && root.getRightNode() == null) {
					return null;
				} else if(root.getLeftNode() != null && root.getRightNode() == null) { // Half-Node with left sub tree
					int inOrderPredecessor = maxInBST(root.getLeftNode());
					root.setInfo(inOrderPredecessor);
					root.setLeftNode(delete(root.getLeftNode(), inOrderPredecessor));
				} else { // half-node with right sub tree or a full node
					int inOrderSuccessor = minInBST(root.getRightNode());
					root.setInfo(inOrderSuccessor);
					root.setRightNode(delete(root.getRightNode(), inOrderSuccessor));
				}
			} else if(val <= root.getInfo()) {
				root.setLeftNode(delete(root.getLeftNode(), val));
			} else {
				root.setRightNode(delete(root.getRightNode(), val));
			}
		}
		return root;
	}
	
	private static Integer minInBST(Node1 root) {
		if(root == null) {
			return null;
		}
		Node1 temp = root;
		while(temp.getLeftNode() != null) {
			temp = temp.getLeftNode();
		}
		return temp.getInfo();
	}

	private static Integer maxInBST(Node1 root) {
		if(root == null) {
			return null;
		}
		Node1 temp = root;
		while(temp.getRightNode() != null) {
			temp = temp.getRightNode();
		}
		return temp.getInfo();
	}

	private static int heightOfBinaryTree(Node1 root) {
		if(root == null) {
			return 0;
		} else if(root.getLeftNode() == null && root.getRightNode() == null) {
			return 1;
		} else {
			return  Math.max(heightOfBinaryTree(root.getLeftNode()), heightOfBinaryTree(root.getRightNode())) +1;
		}
	}

	private static int noOfTotalNodes(Node1 root) {
		if(root == null) {
			return 0;
		} else if(root.getLeftNode() == null && root.getRightNode() == null) {
			return 1;
		} else {
			return noOfTotalNodes(root.getLeftNode()) + noOfTotalNodes(root.getRightNode()) + 1;
		}
	}
	
	private static int noOfHalfNodes(Node1 root) {
		if(root == null) {
			return 0;
		} else if(root.getLeftNode() == null && root.getRightNode() == null) {
			return 0;
		} else if(root.getLeftNode() != null && root.getRightNode() != null) {
			return noOfHalfNodes(root.getLeftNode()) + noOfHalfNodes(root.getRightNode());
		} else {
			return 1 + noOfHalfNodes(root.getLeftNode()) + noOfHalfNodes(root.getRightNode());
		}
	}
	
	private static int noOfFullNodes(Node1 root) {
		if(root == null) {
			return 0;
		} else if(root.getLeftNode() == null && root.getRightNode() == null) {
			return 0;
		} else if(root.getLeftNode() != null && root.getRightNode() != null) {
			return 1 + noOfFullNodes(root.getLeftNode()) + noOfFullNodes(root.getRightNode());
		} else {
			return noOfFullNodes(root.getLeftNode()) + noOfFullNodes(root.getRightNode());
		}
	}

	private static int noOfLeaves(Node1 root) {
		if(root == null) {
			return 0;
		} else if(root.getLeftNode() == null && root.getRightNode() == null) {
			return 1;
		} else {
			return noOfLeaves(root.getLeftNode()) + noOfLeaves(root.getRightNode());
		}
	}

	private static void postorder(Node1 root) {
		if(root != null) {
			postorder(root.getLeftNode());
			postorder(root.getRightNode());
			System.out.print(root.getInfo() + " ");
		}
	}

	private static void preorder(Node1 root) {
		if(root != null) {
			System.out.print(root.getInfo() + " ");
			preorder(root.getLeftNode());
			preorder(root.getRightNode());
		}
	}

	private static void inorder(Node1 root) {
		if(root != null) {
			inorder(root.getLeftNode());
			System.out.print(root.getInfo() + " ");
			inorder(root.getRightNode());
		}
	}

	private static Node1 insert(Node1 root, int val) {
		if(root == null) {
			root = new Node1(val, null, null);
			return root;
		} else if(val <= root.getInfo()) {
			root.setLeftNode(insert(root.getLeftNode(), val));
		} else {
			root.setRightNode(insert(root.getRightNode(), val));
		}
		return root;
	}
}
