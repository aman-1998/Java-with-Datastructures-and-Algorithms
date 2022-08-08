package collection_framework_basics;

import java.util.Iterator;
import java.util.Set;

public class Display_Set<T> {
	
	public void display1(Set<T> set) {
		Iterator<T> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next() + " ");
		}
	}
	
	public void display2(Set<T> set) {
		for(T element : set) {
			System.out.println(element + " ");
		}
	}
	
	public void display3(Set<T> set) {
		for(Iterator<T> ite = set.iterator(); ite.hasNext();) {
			System.out.println(ite.next() + " ");
		}
	}
}
