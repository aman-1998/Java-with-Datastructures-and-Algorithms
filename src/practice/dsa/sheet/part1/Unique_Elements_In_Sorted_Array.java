package practice.dsa.sheet.part1;

/*
 * 
Unique Elements in Sorted Array
--------------------------------
Given a sorted array A, find the size of array A after removing the duplicate elements.

Examples:
A: [1 2 3 3 3 4 5 5]

Size of A after removing duplicate elements: 5

Testing
Input Format
The first line contains an integer ‘T’ denoting the number of test cases.

For each test case, the input contains two lines:

An integer ‘n’ denoting the size of the array A.
n space-separated integers denoting elements of the array A.
Output format
For each test-cases, the output has a line with an integer ‘len’ denoting the length of the resultant array.

Sample Input
2
5
1 1 1 2 2
6
1 3 3 3 4 4
Expected Output
2
3
Constraints
1 <= T <= 100
1 <= n <= 104
1 <= Ai <= 105
 * 
 */

public class Unique_Elements_In_Sorted_Array {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,3,4,4,4,4,4,4,4,4,5,5};
		
		int uniqueElements = removeDuplicatesInSortedArray(arr);
		
		System.out.println(uniqueElements); // T = O(n)
	}
	
	private static int removeDuplicatesInSortedArray(int[] arr) {

		int count = 1;
		
		for(int i = 1; i<= arr.length - 1; i++) {
			if(arr[i] > arr[i-1]) {
				count++;
			}
		}
		
		return count;
	}
}
