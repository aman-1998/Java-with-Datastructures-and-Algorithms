package collection_framework_basics;

import java.util.HashMap;
import java.util.Map;

public class HashMap_N14 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		 
		map.put(12, "Aman Mishra"); // put(4, "Aman")
		map.put(4, "Mala Das");
		map.put(6, "Ayantika Ghosh");
		map.put(2, "Amit Kumar Gupta");
		map.put(3, "Bhim Das");
		map.put(5, "Minki Sen");
		
		Display_Map<Integer, String> disp = new Display_Map<Integer, String>();
		disp.display2(map);
		System.out.println("--------------------------------------------");
		
		System.out.println(map.get(3)); // get(6)
		System.out.println("--------------------------------------------");
		
		map.put(3,"Seema Shaw");
		disp.display2(map);
		System.out.println("--------------------------------------------");
		
		map.remove(4); // remove(5)
		disp.display2(map);
		System.out.println("--------------------------------------------");
		
		System.out.println(map.containsKey(4)); // containsKey(5)
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Bhim Das")); // containsValue("Aman")
		System.out.println(map.containsValue("Seema Shaw"));
		System.out.println(map.size()); // size()
		System.out.println("--------------------------------------------");
		
		Map<Integer, String> map2 = new HashMap<Integer,String>();
		map2.put(12, "Aman Mishra");
		map2.put(6, "Ayantika Ghosh");
		map2.put(2, "Amit Kumar Gupta");
		map2.put(3, "Seema Shaw");
		map2.put(5, "Minki Sen");
		System.out.println(map.equals(map2)); // equals()
		System.out.println("--------------------------------------------");
		
		System.out.println(map.isEmpty()); // isEmpty()
		System.out.println("--------------------------------------------");
		
		map.clear();
		disp.display2(map);
		System.out.println("--------------------------------------------");
	}
}
