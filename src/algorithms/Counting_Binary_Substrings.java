package algorithms;

/*
 * Count of sub-strings with equal consecutive 0’s and 1’s (Count Binary Substrings)
 * Explanation: https://www.youtube.com/watch?v=OJWKzff4Ivg
 * -------------------------------------------------------------------------------------
 * 
 * Given binary string str of 0’s and 1’s only. The task is to count the total number of substrings of string str such that each substring has an equal number of consecutive 0’s and 1’s in it.

Examples:

Input: str = “010011” 
Output: 4 
Explanation: 
The substrings with consecutive 0’s and 1’s are “01”, “10”, “0011”, “01”. Hence, the count is 4. 
Note: 
The two “01” are at different positions: [0, 1] and [3, 4]. 
“010011” has the same number of 0’s and 1’s but they are not consecutive.

Input: str = “0001110010” 
Output: 7 
Explanation: 
The substrings with consecutive 0’s and 1’s are “000111”, “0011”, “01”, “1100”, “10”, “01”, “10”.

Input: str = “0011100011” 
Output: 7
 * 
 * 
 */

public class Counting_Binary_Substrings {
	
	public static void main(String[] args) {
		String str = "0011100011";
		int count = countBinarySubStrings(str); // T = O(n)
		
		System.out.println(count);
	}
	
	private static int countBinarySubStrings(String str) {
		
		int curr = 1;
		int prev = 0;
		int sum=0;
		
		for(int i = 1; i <= str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i-1)) {
				curr++;
			} else {
				sum = sum + Math.min(curr, prev);
				prev = curr;
				curr = 1;
			}
		}
		
		sum = sum + Math.min(curr, prev);
		
		return sum;
	}
}
