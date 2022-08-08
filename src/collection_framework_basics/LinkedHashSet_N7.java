package collection_framework_basics;

import java.util.LinkedHashSet;

public class LinkedHashSet_N7 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		
		linkedHashSet.add(37); // add(37)
		linkedHashSet.add(12);
		linkedHashSet.add(74);
		linkedHashSet.add(4);
		linkedHashSet.add(9);
		linkedHashSet.add(91);
		linkedHashSet.add(41);
		linkedHashSet.add(66);
		linkedHashSet.add(41);
		
		Display_Set<Integer> disp = new Display_Set<Integer>();
		System.out.println("LinkedHashSet:-");
		disp.display3(linkedHashSet);
		System.out.println("\n-------------------------------------------");
	}
}
