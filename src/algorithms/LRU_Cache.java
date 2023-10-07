package algorithms;

import java.util.HashMap;
import java.util.Map;

class Node3 {
	public int key;
	public int value;
	public Node3 left;
	public Node3 right;
}

public class LRU_Cache {
	
	static Map<Integer, Node3> map = new HashMap<>();
	static int capacity = 0;
	static int currentSizeOfCache = 0;
	static Node3 start = null;
	static Node3 last = null;
	
	public static void main(String[] args) {
		LRU_Cache cache = new LRU_Cache(1);
		
		// Test cases
//		System.out.println(cache.get(1)); 
//		cache.add(1,5);
//		cache.add(2,6);
//		cache.add(3,7);
//		System.out.println(cache.get(1)); 
//		cache.add(1,8);
//		System.out.println(cache.get(1));
//		cache.add(4,9);
//		System.out.println(cache.get(2));
//		System.out.println(cache.get(1));
		
		
		//Test Cases
//		cache.add(2,6);
//		cache.add(6,4);
//		cache.add(8,5);
//		System.out.println(cache.get(2));
//		System.out.println(cache.get(6));
//		cache.add(7,3);
		
		cache.add(2,1);
		System.out.println(cache.get(2));
		
		
		Node3 t = start;
		while(t != null) {
			System.out.println(t.key + " | " + t.value);
			t = t.right;
		}
	}
	
	public LRU_Cache(int capacity) {
		LRU_Cache.capacity = capacity;
    }
    
    public int get(int key) {
		if(map.get(key) != null) {
			Node3 currentNode = map.get(key);
			
			if(currentNode == start) {
				return start.value;
			} else if(currentNode == last) {
				last = last.left;
				last.right.left = null;
				last.right = null;
				currentNode.right = start;
				start.left = currentNode;
				start = currentNode;
				return start.value;
			}
			
			currentNode.left.right = currentNode.right;
			currentNode.right.left = currentNode.left;
			currentNode.right = start;
			start.left = currentNode;
			currentNode.left = null;
			start = currentNode;
			return start.value;
		}
		return -1;
    }
    
    public void add(int key, int value) {
    	
    	if(capacity == 0) {
    		return;
    	}
    	
    	if(map.get(key) != null) {
    		map.get(key).value = value;
    	} else {
    		if(currentSizeOfCache < capacity) {
    			if(currentSizeOfCache == 0) {
    				Node3 temp = new Node3();
    				temp.key = key;
    				temp.value = value;
    				temp.left = null;
    				temp.right = null;
    				start = temp;
    				last = temp;
    				map.put(key, temp);
    				currentSizeOfCache++;
    			} else {
    				Node3 temp = new Node3();
    				temp.key = key;
    				temp.value = value;
    				temp.right = start;
    				start.left = temp;
    				temp.left = null;
    				start = temp;
    				map.put(key, temp);
    				currentSizeOfCache++;
    			}
    		} else if(currentSizeOfCache == capacity) {
    			
    			//currentSizeOfCache = 1
    			if(start == last) {
    				Node3 temp = new Node3();
    				temp.key = key;
    				temp.value = value;
    				temp.left = null;
    				temp.right = null;
    				map.remove(start.key);
    				start = temp;
    				last = temp;
    				map.put(key, temp);
    				return;
    			}
    			
    			map.remove(last.key);
    			last = last.left;
    			last.right.left = null;
    			last.right = null;
    			
    			Node3 temp = new Node3();
    			temp.key = key;
    			temp.value = value;
    			temp.right = start;
    			start.left = temp;
    			temp.left = null;
    			start = temp;
    			map.put(key, temp);
    		}
    	}
    }

}
