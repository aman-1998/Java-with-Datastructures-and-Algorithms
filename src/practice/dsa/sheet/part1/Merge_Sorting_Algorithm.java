package practice.dsa.sheet.part1;

import java.util.Arrays;

public class Merge_Sorting_Algorithm {
	public static void main(String[] args) {
		int[] nums = {9,3,7,1,1,5,8};
		
		mergeSort(nums, 0, nums.length-1);
		Arrays.stream(nums).forEach(t -> System.out.print(t + " | "));
	}
	
	/*
	 * T = O(n*log(n))
	 * S = O(n)
	 */
	public static void mergeSort(int[] arr, int p, int r) {

        if(p < r) {
            int q = (p+r)/2;
            mergeSort(arr, p, q);
            mergeSort(arr, q+1, r);
            merge(arr, p, q, r);
        }
    }

	/*
	 * Best approach 
	 * T = O(n), S = O(n)
	 */
    public static void merge(int[] arr, int p, int q, int r) {

        int[] mergedArray = new int[r-p+1];
        int i = p;
        int j = q+1;
        for(int k = 0; k < r-p+1; k++) {

            if(i <= q && j <= r && arr[i] <= arr[j]) {
                mergedArray[k] = arr[i];
                i++;
            } else if(i <= q && j <= r && arr[j] < arr[i]) {
                mergedArray[k] = arr[j];
                j++;
            } else if(i > q && j <= r) {
                mergedArray[k] = arr[j];
                j++;
            } else if(i <= q && j > r) {
                mergedArray[k] = arr[i];
                i++;
            }
        }

        for(int k = p; k <= r; k++) {
            arr[k] = mergedArray[k-p];
        }
    }
}
