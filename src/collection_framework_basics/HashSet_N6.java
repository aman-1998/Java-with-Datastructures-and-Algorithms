package collection_framework_basics;

import java.util.HashSet;

public class HashSet_N6 {
	public static void main(String[] args) {
		HashSet<Student<Integer, String>> hashSet;
		hashSet = new HashSet<Student<Integer, String>>();
		
		hashSet.add(new Student<Integer, String>(123, "Aman Mishra")); // add(8)
		hashSet.add(new Student<Integer, String>(137, "Pooja Upadhyay"));
		hashSet.add(new Student<Integer, String>(131, "Chandu Tyagi"));
		hashSet.add(new Student<Integer, String>(119, "Mala Mishra"));
		hashSet.add(new Student<Integer, String>(155, "Usha Das"));
		hashSet.add(new Student<Integer, String>(139, "Raju Chand"));
		
		Display_Set_Student<Integer, String> disp = new Display_Set_Student<Integer, String>();
		System.out.println("HashSet:-");
		disp.display3(hashSet);
		System.out.println("---------------------------------------------");
		
		boolean check = hashSet.contains(new Student<Integer, String>(123, "Chandu Tyagi"));
		System.out.println(check);
		System.out.println("---------------------------------------------");
		
		System.out.println(hashSet.isEmpty()); // isEmpty()
		System.out.println("---------------------------------------------");
		
		// clone()
		HashSet<Student<Integer, String>> hashSet2 = (HashSet<Student<Integer, String>>)hashSet.clone();
		System.out.println(hashSet2.equals(hashSet)); // equals()
		System.out.println("---------------------------------------------");
		
		System.out.println(hashSet.size()); // size()
		System.out.println("---------------------------------------------");
		
		/*
		 * This will be effective iff hashCode() and equals() methods 
		 * are overrided in Student
		 */
		hashSet.remove(new Student<Integer, String>(155, "Usha Das"));
		System.out.println("HashSet:-");
		disp.display1(hashSet);
		
		hashSet.clear();
		System.out.println("---------------------------------------------");
		
		System.out.println("HashSet:-");
		disp.display1(hashSet);
	}
}

class Student<T, U> {
	private T roll;
	private U name;
	
	public Student(T roll, U name) {
		this.roll = roll;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((roll == null) ? 0 : roll.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll == null) {
			if (other.roll != null)
				return false;
		} else if (!roll.equals(other.roll))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Roll: " + roll+ ", Name: " + name + "]";
	}
}
