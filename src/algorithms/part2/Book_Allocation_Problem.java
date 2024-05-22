package algorithms.part2;

public class Book_Allocation_Problem {
	
	public static void main(String[] args) {
		int[] arr = {25, 26, 28, 49, 24};
		boolean check = possibleToAllocate(arr, 2, 172);
		
		System.out.println(check);
	}
	
	public static int minOfMaxPagesAllocated_BF(int[] books, int totalStudents) {
		
		int n = books.length;
		if(totalStudents > n) {
			return -1;
		}
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = 0; i <= n-1; i++) {
			if(books[i] > max) {
				max = books[i];
			}
			sum = sum + books[i];
		}
		
		for(int i = max; i <= sum; i++) {
			if(possibleToAllocate(books, totalStudents, i)) {
				return i;
			}
		}
		
		return -1;
	}

	private static boolean possibleToAllocate(int[] books, int totalStudents, int maxPages) {
		
		int n = books.length;
		int pages = books[0];
		int studentCount = 1;
		
		for(int i = 1; i <= n-1; i++) {
			if(pages + books[i] <= maxPages) {
				pages = pages + books[i];
			} else {
				pages = books[i];
				studentCount++;
			}
		}
		
		if(studentCount <= totalStudents) {
			return true;
		}
		
		return false;
	}
	
	//--------------------------------------------------------------------------------------------------------------
	
	/*
	 * Optimal solution using binary search
	 * 
	 * T = O(n) + O(log(sum-max)*n)
	 */
	public static int minOfMaxPagesAllocated(int[] books, int totalStudents) {
		
		int n = books.length;
		if(totalStudents > n) {
			return -1;
		}
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = 0; i <= n-1; i++) {
			if(books[i] > max) {
				max = books[i];
			}
			sum = sum + books[i];
		}
		
		int left = max;
		int right = sum;
		
		while(left <= right) {
			int mid = (left + right)/2;
			if(possibleToAllocateAllBooks(books, totalStudents, mid)) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		
		return left;
	}
	
	// T = O(n)
	private static boolean possibleToAllocateAllBooks(int[] books, int totalStudents, int maxPages) {
		
		int n = books.length;
		int pages = books[0];
		int studentCount = 1;
		
		for(int i = 1; i <= n-1; i++) {
			if(pages + books[i] <= maxPages) {
				pages = pages + books[i];
			} else {
				pages = books[i];
				studentCount++;
			}
		}
		
		if(studentCount <= totalStudents) {
			return true;
		}
		
		return false;
	}
}
