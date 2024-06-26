package algorithms.part1;

/*
 * 
Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
8 is the missing number in the range since it does not appear in nums.
 
 
Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.

 */

public class Find_Missing_Number {
	public static void main(String[] args) {
		
		int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
		
		System.out.println(missingNumber(arr));
	}
	
	public static int missingNumber(int[] arr) {
		
		Integer n = arr.length; // Size of array
		
		Integer sn = (n*(n+1)) / 2; // Sum of first n natural numbers
		Integer s = 0;
		
		for(int i=0; i < n; i++) {
			s = s + arr[i];
		}
		
		// The difference of the sum of first n natural nos. and the numbers in the array = missing no.
		int missingNo = sn - s; 
		
		return missingNo;
	}
}
