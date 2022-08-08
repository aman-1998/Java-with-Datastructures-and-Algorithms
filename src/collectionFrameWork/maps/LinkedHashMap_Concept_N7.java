package collectionFrameWork.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Concept_N7 {
	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "Aman"); 
		linkedHashMap.put(2, "Alka");
		linkedHashMap.put(3, "Varsha");
		linkedHashMap.put(4, "Binod");
		DisplayMap<Integer, String> disp = new DisplayMap<>();
		disp.display1(linkedHashMap);
		System.out.println("-------------------------");
		disp.display2(linkedHashMap);
		System.out.println("-------------------------");
		disp.display3(linkedHashMap);
		System.out.println("-------------------------");
		linkedHashMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" | "+entry.getValue()));
		System.out.println("-------------------------");
		System.out.println(linkedHashMap.get(2));
		System.out.println(linkedHashMap.containsKey(5));
		System.out.println(linkedHashMap.containsValue("Varsha"));
		linkedHashMap.remove(3);
		System.out.println("---------------------------------");
		disp.display1(linkedHashMap);
		Map<Integer, String> hashMap2 = new HashMap<>();
		hashMap2.put(4, "Binod");
		hashMap2.put(1, "Aman");
		hashMap2.put(2, "Alka");
		System.out.println("---------------------------------");
		System.out.println(linkedHashMap.equals(hashMap2));
		System.out.println(linkedHashMap.isEmpty());
		System.out.println(linkedHashMap.size());
		/*
		 * 1. We can have only one null key and N no. of null values in LinkedHashMap.
		 * 2. LinkedHashMap is non-synchronized and hence not thread safe.
		 * 3. It throws ConcurrentModificationException while trying to remove element during iteration.
		 * 4. It maintains the order of elements in which they are inserted.
		 * 5. It maintains two additional fields(other than key, value, next) to remember before and after elements.
		 */
	}
}
