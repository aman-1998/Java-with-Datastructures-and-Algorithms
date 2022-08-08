package collection_framework_basics;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_N12 {
	public static void main(String[] args) {
		//Set<Chapter> index = new HashSet<Chapter>();
		//Set<Chapter> index = new LinkedHashSet<Chapter>();
		
		Comparator<Chapter> COMPARE_KEY = new Comparator<Chapter>() {
			public int compare(Chapter chapter1, Chapter chapter2) {
				int number1 = chapter1.getNumber();
				int number2 = chapter2.getNumber();
				
				if(number1 < number2) {
					return 1;
				} 
				/* Equality comparison is required to avoid duplicate entry 
				 * in TreeSet. Implementing hashCode() and equals() 
				 * doesn't work here.
				 */
				else if(number1 == number2) { 
					return 0;
				} else {
					return -1;
				}
			}
		};
		
		Set<Chapter> index = new TreeSet<Chapter>(COMPARE_KEY);
		
		index.add(new Chapter(3,"Algebra"));
		index.add(new Chapter(5,"Straight Line"));
		index.add(new Chapter(1,"Number System"));
		index.add(new Chapter(6,"Triangle"));
		index.add(new Chapter(7,"Parabola"));
		index.add(new Chapter(2,"Calculus"));
		index.add(new Chapter(8,"3D Geometry"));
		index.add(new Chapter(4,"Circle"));
		index.add(new Chapter(6,"Triangle"));
		
		Display_Set<Chapter> disp = new Display_Set<Chapter>();
		disp.display3(index);
		System.out.println("----------------------------------------------");
		
		Chapter ob1 = new Chapter(6,"Triangle");
		Chapter ob2 = new Chapter(6,"Triangle");
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode()+" | "+ob2.hashCode());
		
	}
}

class Chapter {
	private int number;
	private String name;
	
	public Chapter(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Chapter [Number: "+number+", Name: "+name+"]";
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
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
		Chapter other = (Chapter) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
}
