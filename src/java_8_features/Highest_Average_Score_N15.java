package java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Highest_Average_Score_N15 {
	
	public static void main(String[] args) {
		
		List<List<String>> nameScorePairs = new ArrayList<>();
		nameScorePairs.add(Arrays.asList("Bobby", "87"));
		nameScorePairs.add(Arrays.asList("Charles", "100"));
		nameScorePairs.add(Arrays.asList("Eric", "64"));
		nameScorePairs.add(Arrays.asList("Charles", "22"));
		/*
		 * charles -> "Charles", "100"
		 * 			  "Charles", "22"
		 * 
		 * Bobby -> "Bobby", "87"
		 * 
		 * Eric -> "Eric", "64"
		 * 
		 * -----------------------------------------
		 * 
		 * charles -> "61"
		 * 
		 * Bobby -> "87"
		 * 
		 * Eric -> "64"
		 * 
		 * 
		 */
		double highestAvg = nameScorePairs.stream().collect(Collectors.groupingBy(pair -> pair.get(0), Collectors.averagingDouble(list -> Double.valueOf(list.get(1)))))
												   .entrySet().stream().max(Comparator.comparing((Map.Entry<String, Double> entry) -> entry.getValue()))
												    				   .get().getValue();
							   
		System.out.println("Highest Average : " + highestAvg);	
		
		
		double secondHighestAvg = nameScorePairs.stream().collect(Collectors.groupingBy(pair -> pair.get(0), Collectors.averagingDouble(list -> Double.valueOf(list.get(1)))))
				   .entrySet().stream().sorted(Comparator.comparing((Map.Entry<String, Double> entry) -> entry.getValue()).reversed())
				    				   .skip(1).limit(1).findFirst().get().getValue();
		
		System.out.println("Second Highest Average : " + secondHighestAvg);	
	}

}
