package collectionFrameWork.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Concept_N1 {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Aman"); 
		hashMap.put(2, "Alka");
		hashMap.put(3, "Varsha");
		hashMap.put(4, "Binod");
		DisplayMap<Integer, String> disp = new DisplayMap<>();
		disp.display1(hashMap);
		System.out.println("-------------------------");
		disp.display2(hashMap);
		System.out.println("-------------------------");
		disp.display3(hashMap);
		System.out.println("-------------------------");
		hashMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" | "+entry.getValue()));
		System.out.println("-------------------------");
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.containsKey(5));
		System.out.println(hashMap.containsValue("Varsha"));
		hashMap.remove(3);
		System.out.println("---------------------------------");
		disp.display1(hashMap);
		Map<Integer, String> hashMap2 = new HashMap<>();
		hashMap2.put(4, "Binod");
		hashMap2.put(1, "Aman");
		hashMap2.put(2, "Alka");
		System.out.println("---------------------------------");
		System.out.println(hashMap.equals(hashMap2));
		System.out.println(hashMap.isEmpty());
		System.out.println(hashMap.size());
		/*
		 * 1. We can have only one null key and N no. of null values in HashMap.
		 * 2. HashMap is non-synchronized and hence not thread safe.
		 * 3. It throws ConcurrentModificationException while trying to remove element during iteration.
		 */
		
	}
}


