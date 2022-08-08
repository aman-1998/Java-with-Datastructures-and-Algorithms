package collection_framework_basics;

import java.util.Iterator;
import java.util.Map;

public class Display_Map<K, V> {
	
	public void display1(Map<K, V> map) {
		Iterator<Map.Entry<K, V>> ite = map.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry<K, V> entry = ite.next();
			System.out.println(entry.getKey()+" | "+entry.getValue());
		}
	}
	
	public void display2(Map<K, V> map) {
		for(Map.Entry<K, V> entrySet : map.entrySet()) {
			System.out.println(entrySet);
		}
	}
	
	public void display3(Map<K, V> map) {
		for(Iterator<Map.Entry<K, V>> ite = map.entrySet().iterator(); ite.hasNext();) {
			System.out.println(ite.next());
		}
	}
}
