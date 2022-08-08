package collection_framework_basics;

import java.util.Iterator;
import java.util.List;

public class Display_List<T> {
	
	/**
	 * This method displays all the elements in the List using Iterator
	 * @param arrList - List to be displayed
	 * @return void
	 */
	public void display1(List<T> arrList) {
		Iterator<T> ite = arrList.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next()+" ");
		}
	}
	
	/**
	 * This method displays all the elements in the List using
	 * for each loop
	 * @param arrList - List to be displayed
	 * @return void
	 */
	public void display2(List<T> arrList) {
		for(T element : arrList) {
			System.out.println(element+ " ");
		}
	}
}
