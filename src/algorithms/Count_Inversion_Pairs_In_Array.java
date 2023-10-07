package algorithms;

/*

Count inversions in an array
Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).

What is an inversion of an array? Definition: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].

Examples
Example 1:
Input Format: N = 5, array[] = {1,2,3,4,5}
Result: 0
Explanation: we have a sorted array and the sorted array has 0 inversions as for i < j you will never find a pair such that A[j] < A[i]. More clear example: 2 has index 1 and 5 has index 4 now 1 < 5 but 2 < 5 so this is not an inversion.

Example 2:
Input Format: N = 5, array[] = {5,4,3,2,1}
Result: 10
Explanation: we have a reverse sorted array and we will get the maximum inversions as for i < j we will always find a pair such that A[j] < A[i]. Example: 5 has index 0 and 3 has index 2 now (5,3) pair is inversion as 0 < 2 and 5 > 3 which will satisfy out conditions and for reverse sorted array we will get maximum inversions and that is (n)*(n-1) / 2.For above given array there is 4 + 3 + 2 + 1 = 10 inversions.

Example 3:
Input Format: N = 5, array[] = {5,3,2,1,4}
Result: 7
Explanation: There are 7 pairs (5,1), (5,3), (5,2), (5,4),(3,2), (3,1), (2,1) and we have left 2 pairs (2,4) and (1,4) as both are not satisfy our condition. 
 
 */

public class Count_Inversion_Pairs_In_Array {
	
	public static int countInversionPair = 0;
	
	public static void main(String[] args) {
		int[] arr = {9, 3, 7, 1, 1, 5, 8};
		System.out.println(countInversionPairs(arr));
	}
	
	public static int countInversionPairs(int[] arr) {
		
		int n = arr.length; // size of array
		
		arr = mergeSort(arr, 0, n-1);
		return countInversionPair;
	}
	
	public static int[] mergeSort(int[] arr, int p, int r) {
		int q = (p+r)/2;
		if(p < r) {
			arr = mergeSort(arr, p, q);
			arr = mergeSort(arr, q+1, r);
			arr = merge(arr, p, q, r);
		}
		return arr;
	}
	
	public static int[] merge(int[] arr, int p, int q, int r) {
		
		int[] mergedArray = new int[r-p+1];
		int i = p;
		int j = q+1;
		
		for(int k = 0; k < r-p+1; k++) {
			
			if(i == q+1 && j <= r) {
				mergedArray[k] = arr[j];
				j++;
				continue;
			} else if(j == r+1 && i <= q) {
				mergedArray[k] = arr[i];
				i++;
				continue;
			} else if(i <= q && j <= r) {
				if(arr[i] <= arr[j]) {
					mergedArray[k] = arr[i];
					i++;
				} else {
					countInversionPair = countInversionPair + (q - i + 1);
					mergedArray[k] = arr[j];
					j++;
				}
			} else {
				break;
			}
		}
		
		for(int k = 0; k < r-p+1; k++) {
			arr[k+p] = mergedArray[k];
		}
		
		return arr;
	}
}
