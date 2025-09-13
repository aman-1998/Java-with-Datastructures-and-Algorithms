package practice.dsa.sheet.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Kth_Largest_Element_In_An_Array {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6}; // 1, 2, 2, 3, 3, 4, 5, 5, 6
		
		int k = 4;
		
		int kthLargestElement = findKthLargest_Best(arr, k);
		
		System.out.println(kthLargestElement);
	}
	
	/*
	 * Using Merge Sort => Brute Force => T = O(n*log n) => For every case
	 */
	
	
	/*
	 * Better Solution : Using MaxHeap
	 * 
	 * This solution is better for larger values of k i.e., when k is close to n
	 * 
	 * T = O(n + k*log n)
	 * S = O(n)
	 */
	public static int findKthLargest_Better(int[] arr, int k) {
        
		int n = arr.length;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(n, Comparator.reverseOrder());
		maxHeap.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList())); // T = O(2n)
		
		for(int i = 1; i <= k-1; i++) { // T = O(k * log n)
			maxHeap.poll();
		}
		
		return maxHeap.peek();
    }
	
	/*
	 * Best Solution : Using MinHeap
	 * 
	 * This solution is better for smaller values of k i.e., when k is far less than n
	 * Additionally, here we don't have to create a heap of size n. Which makes the 
	 * algorithm memory efficient.
	 * 
	 * T = O(n*log k)
	 * S = O(k)
	 */
	public static int findKthLargest_Best(int[] arr, int k) {
		
		int n = arr.length;
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
		
		for(int i = 0; i <= n-1; i++) { // T = O(n * 2*log k)
			minHeap.add(arr[i]); // T = O(log k)
			if(minHeap.size() > k) {
				minHeap.poll(); // T = O(log k)
			}
		}
	
		return minHeap.peek(); // O(1)
	}
}
