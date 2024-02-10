package algorithms;

public class Longest_Palindromic_Subsequence {
	
	public static StringBuilder lcs = new StringBuilder();
	
	public static void main(String[] args) {
		String str = "aabmsiaddokayemt";
		int len = longestPalindromicSubstring(str);
		System.out.println(len);
		if(len != 0) {
			System.out.println(lcs);
		}
	}

	// T = O(n*n)
	// S = O(n*n)
	private static int longestPalindromicSubstring(String str) {
		
		int len = LCS(str, new StringBuilder(str).reverse().toString());
		return len;
	}
	
	// T = O(m*n)
	// S = O(m*n)
	private static int LCS(String str1, String str2) {
		StringBuilder x = new StringBuilder("#");
		StringBuilder y = new StringBuilder("#");
		
		for(int i = 0; i <= str1.length()-1; i++) {
			x.append(str1.charAt(i));
		}
		
		for(int i = 0; i <= str2.length()-1; i++) {
			y.append(str2.charAt(i));
		}
		
		int m = str1.length();
		int n = str2.length();
		
		int[][] LCS = new int[m+1][n+1];
		
		for(int i = 0; i <= m; i++) {
			LCS[i][0] = 0;
		}
		
		for(int j = 0; j <= n; j++) {
			LCS[0][j] = 0;
		}
		
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				if(x.charAt(i) == y.charAt(j)) {
					LCS[i][j] = 1 + LCS[i-1][j-1];
				} else {
					LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
				}
			}
		}
		
		int i = m;
		int j = n;
		while(i != 0 && j != 0) {
			if(x.charAt(i) == y.charAt(j)) {
				lcs.append(x.charAt(i));
				i = i -1;
				j = j -1;
			} else {
				if(LCS[i-1][j] > LCS[i][j-1]) {
					i = i - 1;
				} else {
					j = j - 1;
				}
			}
		}
		
		lcs.reverse();
		return LCS[m][n];
	}
}
