package java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_N14 {
	
	public static void main(String[] args) {
		
		//Convert String to List<Character>
		String str = "aaabsggdfdd";
		char[] charArr = str.toCharArray();
		List<Character> listOfChars1 = new ArrayList<>();
		for(char ch : charArr) {
			listOfChars1.add(ch);
		}
		listOfChars1.forEach(ch -> System.out.print(ch + " "));
		
		System.out.println();
		
		// invalid
		//str.chars().boxed().map(integer -> (char)integer).collect(Collectors.toList());
		
		List<Character> listOfChars2 = str.chars().mapToObj(premitiveInt -> (char)premitiveInt)
				                                 .collect(Collectors.toList()) ;
		
		listOfChars2.forEach(ch -> System.out.print(ch + " "));
		
		System.out.println("\n----------------------------------------------------------------");
		
	
		int[] arr = {2, 6, 4, 1, 4, 7, 8, 6};
		List<Integer> listOfInt1 = new ArrayList<>();
		for(int i : arr) {
			listOfInt1.add(i);
		}
		listOfInt1.forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		
		List<Integer> listOfInt2 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		listOfInt2.forEach(t -> System.out.print(t + " "));
		
		System.out.println("\n----------------------------------------------------------------");
		
		List<Integer> listOfInt3 = IntStream.of(arr).boxed().collect(Collectors.toList());
		listOfInt3.forEach(t -> System.out.print(t + " "));
	}

}
