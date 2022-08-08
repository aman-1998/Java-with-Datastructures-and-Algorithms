package collectionFrameWork.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Synchronized_HashMap_N5 {
	public static void main(String[] args) {
		Map<Integer, String> synchronizedHashMap = Collections.synchronizedMap(new HashMap<Integer, String>());
		synchronizedHashMap.put(1, "Aman");
		synchronizedHashMap.put(2, "Alka");
		synchronizedHashMap.put(3, "Madhav");
		synchronizedHashMap.put(4, "Harsha");
		synchronizedHashMap.put(5, "Pulkit");
		synchronizedHashMap.put(6, "Binod");
		synchronizedHashMap.put(7, "Raghaw");
		synchronizedHashMap.put(8, "Nandini");
		
		Iterator<Map.Entry<Integer, String>> ite = synchronizedHashMap.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer, String> entry = ite.next();
			if(entry.getKey().equals(5)) {
				synchronizedHashMap.remove(5); // ConcurrentModificationException
			}
		}
		
		/*
		 * 1. We can have only one null key and N no. of null values in synchronizedHashMap.
		 * 2. All operations of synchronizedHashMap is synchronized hence it is thread safe. Lock is applied on whole synchronizedHashMap object.
		 * 3. It throws ConcurrentModificationException while trying to modify content during iteration.
		 */
	}
}
