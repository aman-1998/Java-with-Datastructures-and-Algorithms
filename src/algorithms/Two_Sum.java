package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	
	private static int[] pos = new int[2];
	public static void main(String[] args) {
		
		boolean check = twoSum_3(new int[] {2, 4, 6, 8,11}, 14);
		
		System.out.println(check);
		
		for(int i : pos) {
			System.out.println(i + " ");
		}
	}
	
	// T = O(n^2)
	// S = O(1)
	private static boolean twoSum_1(int[] arr, int target) {
		
		for(int i = 0; i <= arr.length; i++) {
			for(int j = i+1; j <= arr.length-1 ; j++) {
				if(arr[i] + arr[j] == target) {
					pos[0] = i;
					pos[1] = j;
					return true;
				}
			}
		}
		
		return false;
	}
	
	// T = O(n)
	// S = O(n)
	private static boolean twoSum_2(int[] arr, int target) {
		
		Map<Integer, Integer> hMap = new HashMap<>();
		for(int i = 0; i <= arr.length-1; i++) {
			Integer val = hMap.get(target-arr[i]);
			if(val == null) {
				hMap.put(arr[i], i);
			} else {
				pos[0] = val;
				pos[1] = i;
				return true;
			}
		}
		
		return false;
	}
	
	// T = O(nlogn) - Heap Sort
	// S = O(1)
	// Here, we are not finding indices
	private static boolean twoSum_3(int[] arr, int target) {
		
		Arrays.sort(arr);
		int i = 0; 
		int j = arr.length - 1;
		
		while(i < j) {
			if(arr[i] + arr[j] < 14) {
				i++;
			} else if(arr[i] + arr[j] > 14) {
				j--;
			} else {
				return true;
			}
		}
		
		return false;
	}
}
