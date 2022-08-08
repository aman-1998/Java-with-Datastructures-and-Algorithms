package collectionFrameWork.maps;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTable_Concept_N4 {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(1, "Aman");
		hashTable.put(2, "Alka");
		hashTable.put(3, "Madhav");
		hashTable.put(4, "Harsha");
		hashTable.put(5, "Pulkit");
		hashTable.put(6, "Binod");
		hashTable.put(7, "Raghaw");
		hashTable.put(8, "Nandini");
		
		Iterator<Map.Entry<Integer, String>> ite = hashTable.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer, String> entry = ite.next();
			if(entry.getKey().equals(5)) {
				hashTable.remove(5); // ConcurrentModificationException
			}
		}
		
		/*
		 * HashTable's Iterators are fail-fast whereas Enumerations are not fail-fast.
		 */
	}
}
