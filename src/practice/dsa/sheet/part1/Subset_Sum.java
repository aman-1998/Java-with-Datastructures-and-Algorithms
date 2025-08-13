package practice.dsa.sheet.part1;

public class Subset_Sum {
	 public static void main(String[] args) {
		
		 boolean check = subsetSum(new int[] {2, 3, 8, 6, 11}, 17);
		 System.out.println(check);
	}
	 
	 private static boolean subsetSum(int[] arr, int target) {
		 
		 int n = arr.length;
		 int[] x = new int[n + 1];
		 
		 for(int i = 0; i <= n-1; i++) {
			 x[i+1] = arr[i];
		 }
		 
		 boolean[][] ss = new boolean[n+1][target+1];
		 
		 for(int i = 0; i <= n; i++) {
			 ss[i][0] = true;
		 }
		 
		 for(int s = 1; s <= target; s++) {
			 ss[0][s] = false;
		 }
		 
		 for(int i = 1; i <= n; i++) {
			 for(int s = 1; s <= target; s++) {
				 if(s >= x[i]) {
					 ss[i][s] = ss[i-1][s-x[i]] || ss[i-1][s];
				 } else {
					 ss[i][s] = ss[i-1][s];
				 }
			 }
		 }
		 
		 return ss[n][target];
	 }
}
