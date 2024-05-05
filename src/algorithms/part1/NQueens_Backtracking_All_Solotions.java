package algorithms.part1;

import java.util.Scanner;

public class NQueens_Backtracking_All_Solotions {
	
	static int[][] board;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of queens: ");
		n = sc.nextInt();
		board = new int[n][n];
		nQueens(0, n);
	}

	public static void nQueens(int row, int n) {
		
		if(row == n) {
			display();
			System.out.println();
			return;
		}
		
		for(int col=0; col<=n-1; col++) {
			if(isSafe(row, col, n)) {
				board[row][col]=1;
				nQueens(row+1, n);
				board[row][col]=0;
			}
		}
	}

	private static void display() {
		
		for(int[] row : board) {
			for(int i : row) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

	private static boolean isSafe(int row, int col, int n) {
		
		// check in vertical line above the coordinate
		for(int i=0; i <=row-1; i++) {
			if(board[i][col] == 1) {
				return false;
			}
		}
		
		// check diagonals from the coordinate
		for(int i=0; i<=n-1; i++) { // for(int i=0; i<=row-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if(i+j == row+col || i-j == row-col) {
					if(board[i][j] == 1) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
