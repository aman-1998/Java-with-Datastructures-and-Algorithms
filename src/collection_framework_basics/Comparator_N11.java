package collection_framework_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_N11 {
	public static void main(String[] args) {
		ArrayList<Lottery> arLst = new ArrayList<Lottery>();
		arLst.add(new Lottery(10));
		arLst.add(new Lottery(16));
		arLst.add(new Lottery(73));
		arLst.add(new Lottery(82));
		arLst.add(new Lottery(14));
		arLst.add(new Lottery(73));
		arLst.add(new Lottery(89));
		
		Display_List<Lottery> disp = new Display_List<Lottery>();
		disp.display1(arLst);
		System.out.println("---------------------------------------------");
		
		CompareKey COMPARE_KEY = new CompareKey();
		Collections.sort(arLst, COMPARE_KEY);
		disp.display1(arLst);
		System.out.println("---------------------------------------------");
	}
}

class Lottery {
	
	private int number;
	
	public Lottery(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Lottery [number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Lottery other = (Lottery) obj;
		if (number != other.number)
			return false;
		return true;
	}

	public int getNumber() {
		return number;
	}
}

class CompareKey implements Comparator<Lottery> {
	
	public int compare(Lottery lot1, Lottery lot2) {
		int num1 = lot1.getNumber();
		int num2 = lot2.getNumber();
		
		if(num1 < num2) {
			return 1;
		} else {
			return -1;
		}
	}
}