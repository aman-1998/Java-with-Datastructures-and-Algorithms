package practice.dsa.sheet.part1;

// Here, elements of array can only be positive
public class Shortest_Subarray_With_Sum_At_Least_k_Version1 {
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 1, 2, 4, 3};
		int minLength = shortest_subarray_with_sum_at_least_k_Best_2(arr, 7);
		
		//int[] arr = {2, 1, 3, 4, 2, 3, 1};
		//int minLength = shortest_subarray_with_sum_at_least_k_Best(arr, 6);
		
		System.out.println(minLength);
	}
	
	/*
	 * Brute Force : Find all the sub-arrays whose sum is greater than or equal to k. Out of those sub-arrays find the 
	 * 				 one with min length. Return that length.
	 * 
	 * T = O(n^2)
	 * S= O(1)
	 * 
	 */
	private static int shortest_subarray_with_sum_at_least_k_BF(int[] arr, int k) {
		
		int n = arr.length;
		int minCount = Integer.MAX_VALUE;
		
		for(int i = 0; i <= n-1; i++) {
			int count = 0;
			int sum = 0;
			
			for(int j = i; j <= n-1; j++) {
				sum = sum + arr[j];
				count++;
				if(sum >= k) {
					if(count < minCount) {
						minCount = count;
					}
					break;
				}
			}
		}
		
		return minCount;
	}
	
	/*
	 * Best Solution : Variable size sliding window
	 * 
	 * T = O(2n) = O(n)
	 * S = O(1)
	 * 
	 */
	private static int shortest_subarray_with_sum_at_least_k_Best_1(int[] arr, int k) {
		
		int n = arr.length;
		int minLength = Integer.MAX_VALUE;
		int sum = 0;
		int l = 0;
		int r = 0;
		
		while(r < n && l <= r) {
			
			while(sum < k) {
				if(r < n) {
					sum = sum + arr[r];
					r++;
				} else {
					return minLength == Integer.MAX_VALUE ? 0 : minLength;
				}
			}
			r--;
			
			while(sum >= k) {
				if(l <= r) {
					sum = sum - arr[l];
					l++;
				} else {
					return 1;
				}
			}
			
			int len = ((r-l) + 1) + 1;
			if(len < minLength) {
				minLength = len;
			}
			r++;
		}
		
		return minLength;
	}
	
	/*
	 * Best Solution : Variable size sliding window
	 * 
	 * T = O(2n) = O(n)
	 * S = O(1)
	 * 
	 */
	private static int shortest_subarray_with_sum_at_least_k_Best_2(int[] arr, int k) {
		
		int n = arr.length;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int l = 0;
		int r = 0;
		
		while(r <= n && l < n && l <= r) {
			if(sum >= k) {
				int len = r - l;
				if(len < min) {
					min = len;
				}
				sum = sum - arr[l];
				l++;
			} else {
				if(r < n) {
					sum = sum + arr[r];
				}
				r++;
			}
		}
		
		return min == Integer.MAX_VALUE ? 0 : min;
	}
	
}
