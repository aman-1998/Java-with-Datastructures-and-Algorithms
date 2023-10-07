package java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class Stream_N7 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aman", "Alka", "Rupam", "Megha", "Anuj");
		
		list.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));
		List<String> listOfNamesThatStartsWithA = list.stream().filter(name -> name.startsWith("A"))
															   .collect(Collectors.toList());
		System.out.println("------------------------------");
		listOfNamesThatStartsWithA.stream().forEach(nameStartingWithA -> System.out.println(nameStartingWithA));
		
		ArrayList<String> arrListOfNamesThatStartWithA = list.stream().filter(name -> name.startsWith("A"))
																	  .collect(Collectors.toCollection(() -> new ArrayList<String>()));
		
		System.out.println("------------------------------");
		arrListOfNamesThatStartWithA.stream().forEach(nameStartingWithA -> System.out.println(nameStartingWithA));
		
		ArrayList<String> arrNamesStartWithA = list.stream().filter(name -> name.startsWith("A"))
				  .collect(Collectors.toCollection(ArrayList::new));

		System.out.println("------------------------------");
		arrNamesStartWithA.stream().forEach(nameStartingWithA -> System.out.println(nameStartingWithA));
		
		System.out.println("---------------------------------");
		String anyNameStartingWithA = list.stream().filter(name -> name.length() == 4).findAny().get(); // 70% times findAny will pick up the first element
		System.out.println(anyNameStartingWithA);
		
		System.out.println("---------------------------------");
		String firstNameStartingWithA = list.stream().filter(name -> name.length() == 4).findFirst().get();
		System.out.println(firstNameStartingWithA);
		
		System.out.println("---------------------------------");
		String firstNameStartingWithS = list.stream().filter(name -> name.startsWith("S")).findFirst().orElseGet(() ->"Name is not found");
		System.out.println(firstNameStartingWithS);
		
		System.out.println("---------------------------------");
		List<Integer> listOfIntegers = Arrays.asList(3, 4, 8, 1, 5);
		listOfIntegers.stream().filter(element -> element > 4).forEach(elementGreaterThan4 -> System.out.println(elementGreaterThan4));
		
		System.out.println("---------------------------------");
		ArrayList<Integer> arrInt = listOfIntegers.stream().filter(element -> element%2 !=0).collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
		arrInt.forEach(element -> System.out.println(element));
		
		System.out.println("---------------------------------");
		Optional<Integer> opInt = listOfIntegers.stream().filter(element -> element%2 == 0).findFirst();
		
		if(opInt.isPresent()) {
			System.out.println("Even number : "+opInt.get());
		} else {
			System.out.println("No even number found");
		}
		
		System.out.println("---------------------------------");
		int product = listOfIntegers.stream().reduce(1, (result, accumulator) -> result*accumulator);
		System.out.println("Product = "+product);
		
		System.out.println("---------------------------------");
		List<String> listOfWords = listOfIntegers.stream().map(element -> convertToWords(element)).collect(Collectors.toList());
		listOfWords.forEach(t -> System.out.println(t));
		
		ArrayList<String> arrList = new ArrayList<>(listOfWords); // Like this we can convert List to ArrayList
		LinkedList<String> linkedList = new LinkedList<>(listOfWords); // Like this we can convert List to LinkedList
		
		System.out.println("---------------------------------");
		Map<String, Integer> map = listOfIntegers.stream().collect(Collectors.toMap(integer -> convertToWords(integer), integer -> integer));
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" | "+entry.getValue()));
		
		HashMap<String, Integer> hashMap = new HashMap<>(map); // Like this we can convert Map to HashMap
		ConcurrentHashMap<String, Integer> conHashMap = new ConcurrentHashMap<String, Integer>(hashMap); // Like this we can convert HashMap to ConcurrentHashMap
		ConcurrentHashMap<String, Integer> conHashMap2 = new ConcurrentHashMap<String, Integer>(map); // Like this we can convert Map to ConcurrentHashMap
		
		ConcurrentMap<String, Integer> conMap = listOfIntegers.stream().collect(Collectors.toConcurrentMap(integer -> convertToWords(integer), integer -> integer));
		ConcurrentHashMap<String, Integer> conHashMap3 = new ConcurrentHashMap<String, Integer>(conMap); // Like this we can convert ConcurrentMap to ConcurrentHashMap
		
		System.out.println("---------------------------------");
		conHashMap3.entrySet().stream().forEach(entry -> System.out.println(entry));
		
	}
	
	public static String convertToWords(Integer element) {
		switch(element) {
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Threee";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		default:
			return "Invalid range";
		}
	}
}
