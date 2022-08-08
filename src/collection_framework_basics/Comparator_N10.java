package collection_framework_basics;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Comparator_N10 {
	public static void main(String[] args) {
		List<Info> dictionary = new LinkedList<Info>();
		
		dictionary.add(new Info(1,"Frog"));
		dictionary.add(new Info(7,"Lion"));
		dictionary.add(new Info(4,"Tiger"));
		dictionary.add(new Info(5,"Monkey"));
		dictionary.add(new Info(2,"Panda"));
		dictionary.add(new Info(9,"Eagle"));
		dictionary.add(new Info(1,"Fox"));
		dictionary.add(new Info(3,"Tiger"));
		
		Comparator<Info> COMPARE_KEY = new Comparator<Info>() {
			
			public int compare(Info info1, Info info2) {
				String value1 = info1.getValue();
				String value2 = info2.getValue();
				int len1 = value1.length();
				int len2 = value2.length();
				
				int min = len1 < len2 ? len1 : len2;
				
				// to ensure alphabetic order
				for(int i = 0; i < min; i++) {
					if((int)value1.charAt(i) - (int)value2.charAt(i) != 0) {
						return (int)value1.charAt(i) - (int)value2.charAt(i);
					}
				}
				
				// follow key order when value is same
				if(len1 == len2) {
					int key1 = info1.getKey();
					int key2 = info2.getKey();
					
					if(key1 < key2) {
						return -1;
					} else {
						return 1;
					}
				}
				
				// Example:- Aman , Amanpreet -> Aman should come first
				if(len1 < len2) {
					return -1;
				} else {
					return 1;
				}
			}
		};
		
		Display_List<Info> disp = new Display_List<Info>();
		disp.display2(dictionary);
		System.out.println("---------------------------------------------");
		
		Collections.sort(dictionary, COMPARE_KEY);
		disp.display2(dictionary);
		System.out.println("---------------------------------------------");
	}
}

class Info {
	private int key;
	private String value;
	
	public Info(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Info [Key: "+key+", Value: "+value+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + key;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		Info other = (Info) obj;
		if (key != other.key)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
}