package java_8_features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_N10 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Aman", "Alka", "Manju", "Aayush", "Pinki");
		Collections.sort(list1); // sort in ascending order
		list1.stream().forEach(element -> System.out.print(element+"|"));
	
		System.out.println("\n-----------------------------------------------");
		
		List<String> list2 = Arrays.asList("Aman", "Alka", "Manju", "Aayush", "Pinki");
		Collections.sort(list2, Comparator.reverseOrder()); // sort in descending order
		list2.stream().forEach(element -> System.out.print(element+"|"));
		
		System.out.println("\n-----------------------------------------------");
		
		List<String> list3 = Arrays.asList("Aman", "Alka", "Manju", "Aayush", "Pinki");
		Collections.reverse(list3); // reverse a list
		list3.forEach(element -> System.out.print(element+"|"));
		
		System.out.println("\n-----------------------------------------------");
		
		List<String> list4 = Arrays.asList("Aman", "Alka", "Manju", "Aayush", "Pinki");
		list4 = list4.stream().sorted().collect(Collectors.toList()); // sort in ascending order
		list4.stream().forEach(element -> System.out.print(element+"|"));
		
		System.out.println("\n-----------------------------------------------");
		
		List<String> list5 = Arrays.asList("Aman", "Alka", "Manju", "Aayush", "Pinki");
		list5 = list5.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // sort in descending order
		list5.stream().forEach(element -> System.out.print(element+"|"));
	}
}
