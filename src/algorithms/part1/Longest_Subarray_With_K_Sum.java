package algorithms.part1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Longest_Subarray_With_K_Sum {
	
	public static void main(String[] args) {
		
		//int[] arr = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
		//int maxCount = longest_subarray_with_k_sum_1(arr, 0);
		
		//int[] arr = {8, -5, 5, 2, 1, 3};
		//int maxCount = longest_subarray_with_k_sum_1(arr, 3);
		
		//int[] arr = {8, -5, 5, 2, 1, 3};
		//int maxCount = longest_subarray_with_0_sum(arr);
		
		//int[] arr = {-1, 1, 5, 6, 7};
		//int maxCount = longest_subarray_with_0_sum(arr);
		
		//int[] arr = {5, 2, 3, -1, 2, 3, -2, 1, 1, 6, 4};
		//int maxCount = longest_subarray_with_k_sum(arr, 7);
		
		//int[] arr = {1, 4, 3, 3, 5, 5};
		//int maxCount = longest_subarray_with_k_sum(arr, 16);
		
		//int[] arr = {-7, -11, -3, -7, 4, 15, -13, 18, -10, -10};
		//int maxCount = longest_subarray_with_k_sum(arr, 23);
		
		//int[] arr = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
		//int maxCount = longest_subarray_with_k_sum(arr, 15);
		
		//int[] arr = {2, -2, 3, -3, 3, 3, 4, -4, 5, -5};
		//int maxCount = shortest_subarray_with_at_least_k_sum(arr, 3);
		
		//int[] arr = {77, 19, 35, 10, -14};
		//int maxCount = shortest_subarray_with_at_least_k_sum(arr, 19);
		
		//int[] arr = { -8, -8, -3, 8 };
		//int maxCount = shortest_subarray_with_k_sum(arr, 5);
		
		//int[] arr = {2, 4, -1, 8, -1};
		//int maxCount = shortest_subarray_with_k_sum(arr, 6);
		
		//int[] arr = {48, 99, 37, 4, -31};
		//int maxCount = shortest_subarray_with_at_least_k_sum(arr, 140);
		
		//int[] arr = {2, -2, 3, -3, 7, 6, -6};
		//int maxCount = longest_subarray_with_k_sum(arr, 0);
		
		int[] arr = {3, 4, 7, 2, -3, 1, 4, 2, 1};
		int maxCount = number_of_subarrays_with_sum_k(arr, 7);
		
		
		System.out.println(maxCount);
	}
	
	// Brute Force : Find all sub-arrays whose sum is equal to target. Find the the sub-array with max length. Return that length.
	// T = O(n^2)
	// S = O(1)
	private static int longest_subarray_with_k_sum_1(int[] arr, int target) {
		
		int n = arr.length;
		int maxCount = Integer.MIN_VALUE;
		
		for(int i = 0; i <= n-1; i++) {
			int count = 0;
			int sum = arr[i];
			if(sum == target) {
				count = 1;
				if(maxCount < count) {
					maxCount = count;
				}
			}
			
			count = 0;
			for(int j = i+1; j <= n-1; j++) {
				sum = sum + arr[j];
				count++;
				if(sum == target) {
					if(maxCount < count) {
						maxCount = count;
					}
				}
			}
		}
		
		return maxCount + 1;
	}
	
	// Best Solution : Here target is assumed to be zero
	// T = O(n)
	// S = O(n)
	private static int longest_subarray_with_0_sum(int[] arr) {
		
		int n = arr.length;
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int maxLength = Integer.MIN_VALUE;
		int count = 0;
		int sum = 0;
		
		for(int i = 0; i <= n-1; i++) {
			sum = sum + arr[i];
			if(sum == 0) {
				maxLength = i + 1;
			} else {
				Integer index = hashMap.get(sum);
				if(index == null) {
					hashMap.put(sum, i);
				} else {
					count = i - index;
					if(maxLength < count) {
						maxLength = count;
					}
				}
			}
		}
		
		return maxLength;
	}
	
	// Best Solution: Here, target can be any thing
	// T = O(n)
	// S = O(n)
	private static int longest_subarray_with_k_sum(int[] arr, int k) {
		
		int n = arr.length;
		Map<Integer, Integer> hashMap = new HashMap<>();
		int sum = 0;
		int maxLength = 0;
		
		for(int i = 0; i <= n-1; i++) {
			sum = sum + arr[i];
			if(sum == k) {
				maxLength = i + 1;
			} else {
				Integer index = hashMap.get(sum-k);
				if(index != null) {
					int count = i - index;
					if(maxLength < count) {
						maxLength = count;
					}
				}
			}
			
			if(hashMap.get(sum) == null) {
				hashMap.put(sum, i);
			}
		}
		
		return maxLength;
	}
	
	
	private static int shortest_subarray_with_k_sum(int[] arr, int k) {
		
		int n = arr.length;
		Map<Integer, Integer> hashMap = new HashMap<>();
		int sum = 0;
		int minLength = Integer.MAX_VALUE;
		
		for(int i = 0; i <= n-1; i++) {
			
			sum = sum + arr[i];
			if(sum == k) {
				int count = i - 1;
				if(count < minLength) {
					minLength = i + 1;
				}
			}
			
			Integer index = hashMap.get(sum-k);
			
			if(index != null) {
				int count = i - index;
				if(count < minLength) {
					minLength = count;
				}
			}
			
			hashMap.put(sum, i);
		}
		
		return minLength;
	}
	
	private static int shortest_subarray_with_at_least_k_sum(int[] arr, int k) {
		
		int n = arr.length;
		Map<Integer, Integer> hashMap = new HashMap<>();
		int sum = 0;
		int minLength = Integer.MAX_VALUE;
		int flag = 1;
		
		for(int i = 0; i <= n-1; i++) {
			
			sum = sum + arr[i];
			if(sum >= k && flag == 1) {
				minLength = i + 1;
				flag++;
			}
			
			Iterator<Map.Entry<Integer, Integer>> ite = hashMap.entrySet().iterator();
			while(ite.hasNext()) {
				Entry<Integer, Integer> entry = ite.next();
				if(entry.getKey() <= sum - k) {
					
					int count = i - entry.getValue();
					if(minLength > count) {
						minLength = count;
					}
					flag++;
				}
			}
			hashMap.put(sum, i);
		}
		
		return minLength;
	}
	
	private static int number_of_subarrays_with_sum_k(int[] arr, int k) {
		
		int n = arr.length;
		Map<Integer, Integer> hashMap = new HashMap<>(); //<sum , no. of time we have seen that sum>
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i <= n-1; i++) {
			
			sum = sum + arr[i];
			if(sum == k) {
				count++;
			}
			
			Integer frequency = hashMap.get(sum - k);
			
			if(frequency != null) {
				count = count + hashMap.get(sum-k);
			}
			
			if(hashMap.get(sum) == null) {
				hashMap.put(sum, 1);
			} else {
				hashMap.put(sum, hashMap.get(sum) + 1);
			}
		}
		
		return count;
	}
}
