package algorithms;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 9, 2, 5, 3, 7, 101, 18};
		int n = arr.length;
		
		int[][] dp = new int[n+1][n+1];
		for(int[] i : dp) {
			Arrays.fill(i, -1);
		}
		
		int len = LIS(0, -1, arr, dp);
		System.out.println(len);
	}
	
	/*
	 * T = O(n*n)
	 * S = O(n*n) + O(stack_space) = O(n*n) + O(n) = O(n*n)
	 */
	private static int LIS(int i, int prev, int[] arr, int[][] dp) {
		
		int n = arr.length;
		if(i == n) {
			return 0;
		}
		
		if(dp[i+1][prev+1] != -1) {
			return dp[i+1][prev+1];
		}
		
		int len = LIS(i+1, prev, arr, dp);
		if(prev == -1 || arr[prev] < arr[i]) {
			len = Math.max(1 + LIS(i+1, i, arr, dp), len);
		}
		
		dp[i+1][prev+1] = len;
		return len;
	}
}
