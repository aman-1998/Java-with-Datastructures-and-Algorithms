package collectionFrameWork.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_N6 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> conHashMap = new ConcurrentHashMap<>();
		conHashMap.put(1, "Aman");
		conHashMap.put(2, "Alka");
		conHashMap.put(3, "Madhav");
		conHashMap.put(4, "Harsha");
		conHashMap.put(5, "Pulkit");
		conHashMap.put(6, "Binod");
		conHashMap.put(7, "Raghaw");
		conHashMap.put(8, "Nandini");
		
		Iterator<Map.Entry<Integer, String>> ite = conHashMap.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer, String> entry = ite.next();
			if(entry.getKey().equals(5)) {
				conHashMap.remove(5); // will not throw ConcurrentModificationException
			}
		}
		
		ite = conHashMap.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer, String> entry = ite.next();
			System.out.println(entry.getKey() +" | "+entry.getValue());
		}
		
		/*
		 * 1. We can not have null key and null values in ConcurrentHashMap.
		 * 
		 * 2. All operations of ConcurrentHashMap is not synchronized. Only write operations 
		 * are synchronized and hence it is thread safe. Lock is not applied on whole 
		 * ConcurrentHashMap object. Segment-wise lock is applied.
		 * 
		 * 3. It does not throw ConcurrentModificationException while trying to modify content during iteration.
		 */
	}
}
