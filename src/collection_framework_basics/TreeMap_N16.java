package collection_framework_basics;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_N16 {
	public static void main(String[] args) {
		
		Comparator<Batsman> COMPARE_KEY = new Comparator<Batsman>() {
			
			public int compare(Batsman batsman1, Batsman batsman2) {
				
				int runs1 = batsman1.getRuns();
				int runs2 = batsman2.getRuns();
				
				if(runs1 < runs2) {
					return 1;
				} /*else if(runs1 == runs2) {
					return 0;
				} */else {
					return -1;
				}
			}
		};
		
		Map<Batsman, String> map = new TreeMap<Batsman, String>(COMPARE_KEY);
		
		map.put(new Batsman("Sachin", 18480), "India");
		map.put(new Batsman("Ricky Ponting", 14538), "Australia");
		map.put(new Batsman("Adam Gilchrist", 10347), "Australia");
		map.put(new Batsman("Jaqes Kallis", 10210), "South Africa");
		map.put(new Batsman("Alister Cook", 11257), "England");
		map.put(new Batsman("MS Dhoni", 10358), "India");
		map.put(new Batsman("Virat Kohli", 12930), "India");
		
		Display_Map<Batsman, String> disp = new Display_Map<Batsman, String>();
		disp.display1(map);
		System.out.println("---------------------------------------------");
		
		map.put(new Batsman("Ricky Ponting", 14538), "Newzealand");
		disp.display3(map);
		System.out.println("---------------------------------------------");
	}
}

class Batsman {
	private String name;
	private int runs;
	
	public Batsman(String name, int runs) {
		this.name = name;
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	@Override
	public String toString() {
		return "Batsman [name=" + name + ", runs=" + runs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + runs;
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
		Batsman other = (Batsman) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (runs != other.runs)
			return false;
		return true;
	}
}