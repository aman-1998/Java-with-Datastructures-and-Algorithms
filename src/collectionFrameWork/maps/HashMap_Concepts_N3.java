package collectionFrameWork.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Concepts_N3 {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Aman");
		hashMap.put(2, "Alka");
		hashMap.put(3, "Madhav");
		hashMap.put(4, "Harsha");
		hashMap.put(5, "Pulkit");
		hashMap.put(6, "Binod");
		hashMap.put(7, "Raghaw");
		hashMap.put(8, "Nandini");
		
		
		Iterator<Map.Entry<Integer, String>> ite = hashMap.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer, String> entry = ite.next();
			if(entry.getKey().equals(5)) {
				hashMap.remove(5); // ConcurrentModificationException
			}
		}
	}
}
