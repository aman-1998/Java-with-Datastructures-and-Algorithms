package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Integer> list = Arrays.asList(5,1,8,2,9,7,3,6,4,0);
		Collections.sort(list);
		
		System.out.print("Enter the target element: ");
		int target = in.nextInt();
		
		// since the array is sorted so, we will use binary-search
		boolean isPresent = binarySearch(list, target);
		
		if(isPresent) {
			System.out.println(target + " is present");
		} else {
			System.out.println(target + " is not present");
		}
	}
	
	public static boolean binarySearch(List<Integer> list, int target) { // O(log n)
		int l = 0;
		int r = list.size() - 1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(list.get(mid) == target) {
				return true;
			} else if(list.get(mid) < target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return false;
	}
}
