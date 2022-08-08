package collection_framework_basics;

import java.util.Iterator;
import java.util.Set;

public class Display_Set_Student<T, U> {
	
	public void display1(Set<Student<T, U>> set) {
		Iterator<Student<T, U>> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	
	public void display2(Set<Student<T, U>> set) {
		for(Student<T, U> student : set) {
			System.out.println(student);
		}
	}
	
	public void display3(Set<Student<T, U>> set) {
		for(Iterator<Student<T, U>> ite = set.iterator(); ite.hasNext();) {
			System.out.println(ite.next());
		}
	}
}
