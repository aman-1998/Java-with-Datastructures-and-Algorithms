package collectionFrameWork.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable_Concept_N2 {
	public static void main(String[] args) {
		Map<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(1, "Aman"); 
		hashTable.put(2, "Alka");
		hashTable.put(3, "Varsha");
		hashTable.put(4, "Binod");
		DisplayMap<Integer, String> disp = new DisplayMap<>();
		disp.display1(hashTable);
		System.out.println("-------------------------");
		disp.display2(hashTable);
		System.out.println("-------------------------");
		disp.display3(hashTable);
		System.out.println("-------------------------");
		hashTable.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" | "+entry.getValue()));
		System.out.println("-------------------------");
		System.out.println(hashTable.get(2));
		System.out.println(hashTable.containsKey(5));
		System.out.println(hashTable.containsValue("Varsha"));
		hashTable.remove(3);
		System.out.println("---------------------------------");
		disp.display1(hashTable);
		Map<Integer, String> hashMap2 = new HashMap<>();
		hashMap2.put(4, "Binod");
		hashMap2.put(1, "Aman");
		hashMap2.put(2, "Alka");
		System.out.println("---------------------------------");
		System.out.println(hashTable.equals(hashMap2));
		System.out.println(hashTable.isEmpty());
		System.out.println(hashTable.size());
		/*
		 * 1. We can not have null key and null values in HashTable.
		 * 
		 * 2. All operations of Hashtable are synchronized hence it is thread safe. Lock is applied on whole Hashtable object.
		 * 
		 * 3. The Hastable's iterators are fail-fast. Its enumerations are not.
		 * 
		 * 4. It is not recommended to use HashTable because in order to maintain 
		 * legacy this class is not modified by oracle. So, performance wise there 
		 * will be a degradation if we use HashTable.
		 */
	}
}
