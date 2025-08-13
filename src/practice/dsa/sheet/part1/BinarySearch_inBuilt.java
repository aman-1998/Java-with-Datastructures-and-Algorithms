package practice.dsa.sheet.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BinarySearch_inBuilt {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(51,13,82,21,96,74,3,62,48,10);
		Collections.sort(list);
		
		ListIterator<Integer> ite = list.listIterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter the target to be searched: ");
		int target = in.nextInt();
		
		/*
		 * In the sorted array Collections.binarySearch(list, target) gives
		 * us the index of the target if it is present. If the target is not
		 * present then we get -(position) - 1, where 'pos' is the index where 
		 * the target should have been present if it would have been present.
		 */
		int pos = Collections.binarySearch(list, target);
		System.out.println(target+" is found at "+pos+" index");
		
		int[] arr = new int[] {6, 7, 12, 17, 20, 23, 28, 29, 34, 39, 49, 51, 55};
		
		int index = Arrays.binarySearch(arr, 23);
		
		System.out.println(index);
		
		index = Arrays.binarySearch(arr, 6, 13, 55);
		
		System.out.println(index);
	}
}
