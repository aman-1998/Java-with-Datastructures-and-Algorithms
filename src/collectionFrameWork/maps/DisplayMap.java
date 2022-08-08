package collectionFrameWork.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DisplayMap<K, V> {
	public void display1(Map<K, V> map) {
		for(Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" | "+entry.getValue());
		}
	}
	
	public void display2(Map<K, V> map) {
		Iterator<Entry<K, V>> ite = map.entrySet().iterator();
		while(ite.hasNext()) {
			Entry<K, V> entry = ite.next();
			System.out.println(entry.getKey()+" | " + entry.getValue());
		}
	}
	
	public void display3(Map<K, V> map) {
		for(Iterator<Entry<K, V>> ite = map.entrySet().iterator(); ite.hasNext();) {
			Entry<K, V> entry = ite.next();
			System.out.println(entry.getKey()+" | " + entry.getValue());
		}
	}
}
