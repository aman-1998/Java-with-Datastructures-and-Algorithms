package java_8_features;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_N8 {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Aman Kumar Mishra");
		hmap.put(2, "Alka Prasad");
		hmap.put(3, "Namita Pathak");
		hmap.put(4, "Garima Singh");
		hmap.put(5, "Madhav");
		hmap.put(6, "Dinesh Ahuja");
		hmap.put(7, "Priya Dutta");
		
		hmap.entrySet().stream().filter(entry -> entry.getKey() % 2 == 0)
								.forEach(entryWithEvenkey -> System.out.println(entryWithEvenkey.getKey() +" | "+entryWithEvenkey.getValue()));
	
		System.out.println("-----------------------------------------");
		List<String> names = hmap.entrySet().stream().filter(entry -> entry.getKey() % 2 == 0)
													 .map(entryWithEvenKey -> entryWithEvenKey.getValue()) // Data transformation
													 .collect(Collectors.toList());
		
		names.stream().forEach(name -> System.out.println(name));
		
		System.out.println("-----------------------------------------");
		
		Map<String, BigDecimal> synHmap = Collections.synchronizedMap(new HashMap<String, BigDecimal>());
		synHmap.put("meter-1", BigDecimal.valueOf(1.233));
		synHmap.put("meter-2", BigDecimal.valueOf(2.012));
		synHmap.put("meter-3", BigDecimal.valueOf(1.203));
		synHmap.put("meter-4", BigDecimal.valueOf(0.812));
		synHmap.put("meter-5", BigDecimal.valueOf(1.430));
		synHmap.put("meter-6", BigDecimal.valueOf(0.591));
		synHmap.put("meter-7", BigDecimal.valueOf(0.401));
		synHmap.put("meter-8", BigDecimal.valueOf(2.234));
		synHmap.put("meter-9", BigDecimal.valueOf(1.552));
		
		//Sum of the values of map with odd meters
		BigDecimal sumOfValuesOfMapWithOddMeters = synHmap.entrySet().stream()
										   .filter(entry -> Integer.valueOf(entry.getKey().substring(entry.getKey().length() - 1)) % 2 != 0)
										   .map(entry -> entry.getValue())
										   .reduce(BigDecimal.valueOf(0), (result, accumulator) -> result.add(accumulator));
		
		System.out.println("Sum = "+sumOfValuesOfMapWithOddMeters);
		
		//Size Of Map With Odd Meters
		int sizeOfMapWithOddMeters = synHmap.entrySet().stream()
													   .filter(entry -> Integer.valueOf(entry.getKey().substring(entry.getKey().length() - 1)) % 2 != 0)
													   .collect(Collectors.toMap(entryWithOddMeter -> entryWithOddMeter.getKey() , entryWithOddMeter -> entryWithOddMeter.getValue())).size();
		
		System.out.println("size Of Map With Odd Meters = "+sizeOfMapWithOddMeters);
		
		//Size Of Map With Odd Meters
		long sizeOfMapWithOddMeters_ = synHmap.entrySet().stream()
											  .filter(entry -> Integer.valueOf(entry.getKey().substring(entry.getKey().length() - 1)) % 2 != 0)
											  .count();
		
		System.out.println("size Of Map With Odd Meters = "+sizeOfMapWithOddMeters_);
		
		System.out.println("---------------------------------------------");
		
		//average
		BigDecimal average1 = sumOfValuesOfMapWithOddMeters.divide(BigDecimal.valueOf(sizeOfMapWithOddMeters), RoundingMode.HALF_UP);
		BigDecimal average2 = sumOfValuesOfMapWithOddMeters.divide(BigDecimal.valueOf(sizeOfMapWithOddMeters_), RoundingMode.HALF_UP);
		System.out.println(average1 + " | " +average2);
		
		System.out.println("---------------------------------------------");
		
		
		/*
		 * map is one-to-one mapping
		 */
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
		
		listOfIntegers.stream().map(t -> t*10)
		                       .forEach(t -> System.out.print(t + " "));
		
		System.out.println();
		
		/*
		 * flatMap is one-to-many mapping
		 * 
		 * 1 -> [10, 20]
		 * 2 -> [20, 40]
		 * 3 -> [30, 60]
		 * 4 -> [40, 80]
		 * 5 -> [50, 100]
		 * 
		 * All flattened into: 10, 20, 20, 40, 30, 60, 40, 80, 50, 100
		 */
		listOfIntegers.stream().flatMap(t -> Stream.of(t*10, t*20))
		                       .forEach(t -> System.out.print(t + " "));
		
		System.out.println();
		
		List<Integer> listOfIntegers1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> listOfIntegers2 = Arrays.asList(6, 7, 8, 9, 10);
		List<Integer> listOfIntegers3 = Arrays.asList(11, 12, 13, 14, 15);
		
		//List<List<Integer>> twoDList = new ArrayList<List<Integer>>();
		List<List<Integer>> twoDList = new ArrayList<>();
		twoDList.add(listOfIntegers1);
		twoDList.add(listOfIntegers2);
		twoDList.add(listOfIntegers3);
		
		/*
		 *	[[1, 2, 3, 4, 5]]
		 *	[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]		
		 *	[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15]]
		 */
		twoDList.stream().flatMap(list -> Stream.of(list)).forEach(t -> System.out.print(t + " "));
		
		System.out.println();
		
		/*
		 * Flatten the 2D list:
		 * 
		 * [1, 2, 3, 4, 5]
		 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
		 */
		twoDList.stream().flatMap(list -> list.stream()).forEach(t -> System.out.print(t + " "));
		
	}
}
