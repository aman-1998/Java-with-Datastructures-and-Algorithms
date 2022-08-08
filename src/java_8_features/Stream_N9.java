package java_8_features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_N9 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2, 7, 4, 1, 1, 9, 8, 5);
		Collections.sort(list1); // sort in ascending order
		list1.stream().forEach(element -> System.out.print(element+"|"));
	
		System.out.println("\n-----------------------------------------------");
		
		List<Integer> list2 = Arrays.asList(6, 7, 1, 8, 1, 0, 2);
		Collections.sort(list2, Comparator.reverseOrder()); // sort in descending order
		list2.stream().forEach(element -> System.out.print(element+"|"));
		
		System.out.println("\n-----------------------------------------------");
		
		List<Integer> list3 = Arrays.asList(51, 88, 34, 19, 37, 41, 82);
		Collections.reverse(list3); // reverse a list
		list3.forEach(element -> System.out.print(element+"|"));
		
		System.out.println("\n-----------------------------------------------");
		
		List<Integer> list4 = Arrays.asList(67, 39, 10, 48, 83, 28, 10, 73);
		list4 = list4.stream().sorted().collect(Collectors.toList()); // sort in ascending order
		list4.stream().forEach(element -> System.out.print(element+"|"));
		
		System.out.println("\n-----------------------------------------------");
		
		List<Integer> list5 = Arrays.asList(46, 19, 46, 9, 19, 67, 12, 37, 26);
		list5 = list5.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // sort in descending order
		list5.stream().forEach(element -> System.out.print(element+"|"));
	}
}
