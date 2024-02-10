package algorithms;

public class Longest_Increasing_Subsequence {
	
	public static void main(String[] args) {
		int len = LIS(new int[] {10, 9, 8, 7, 25, 13});
		System.out.println(len);
	}
	
	private static int LIS(int[] arr) {
		
		int n = arr.length;
		int[] x = new int[n + 1];
	 
		for(int i = 0; i <= n-1; i++) {
			x[i+1] = arr[i];
		}
		
		int[][] LIS = new int[n+1][n+1];
		
		for(int minSofarIndex = 0; minSofarIndex <= n; minSofarIndex++) {
			LIS[0][minSofarIndex] = 0;
		}
		
		for(int i = 0; i <= n; i++) {
			LIS[i][0] = 0;
		}
		
		for(int i = 1; i <= n; i++) {
			for(int minSoFarIndex = 1; minSoFarIndex <= n; minSoFarIndex++) {
				if(x[i] < x[minSoFarIndex]) {
					LIS[i][minSoFarIndex] = Math.max(1 + LIS[i-1][i], LIS[i-1][minSoFarIndex]);
				} else {
					LIS[i][minSoFarIndex] = LIS[i-1][minSoFarIndex];
				}
			}
		}
		
		return LIS[n][n];
	}
}
