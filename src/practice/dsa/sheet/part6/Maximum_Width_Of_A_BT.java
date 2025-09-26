package practice.dsa.sheet.part6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import practice.dsa.sheet.part6.utility.Node;

public class Maximum_Width_Of_A_BT {
	
	public static void main(String[] args) {
		
	}
	
	public int widthOfBinaryTree(Node root) {
        
		Queue<ValueAndIndex> queue = new LinkedList<>();
		List<ValueAndIndex> nodesList = new ArrayList<>();
		if(root != null) {
			int index = 0;
			queue.add(new ValueAndIndex(root.data, index));
			while(!queue.isEmpty()) {
				int size = queue.size();
				for(int i = 1; i <= size; i++) {
					ValueAndIndex popped = queue.poll();
					
				}
			}
		}
    }
}

class ValueAndIndex {
	
	public int val;
	public int index;
	
	public ValueAndIndex(int val, int index) {
		this.val = val;
		this.index = index;
	}
}
