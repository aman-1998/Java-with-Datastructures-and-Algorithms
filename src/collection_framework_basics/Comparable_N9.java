package collection_framework_basics;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_N9 {
	public static void main(String[] args) {
		ArrayList<Country> countries = new ArrayList<Country>();
		
		countries.add(new Country("India", 3));
		countries.add(new Country("USA", 18));
		countries.add(new Country("China", 13));
		countries.add(new Country("Japan", 5));
		countries.add(new Country("UK", 2.8F));
		countries.add(new Country("France", 2));
		countries.add(new Country("Germany", 2));
		
		Display_List<Country> disp = new Display_List<Country>();
		disp.display1(countries);
		System.out.println("----------------------------------------------");
		
		Collections.sort(countries);
		disp.display1(countries);
		System.out.println("----------------------------------------------");
	}
}

class Country implements Comparable<Country> {
	
	private float gdp;
	private String name;
	
	public Country(String name, float gdp) {
		this.gdp = gdp;
		this.name = name;
	}
	
	public int compareTo(Country country) {
		String name1 = this.name;
		String name2 = country.name;
		int len1 = name1.length();
		int len2 = name2.length();
		
		int min = len1 < len2 ? len1 : len2;
		
		for(int i = 0; i <= min-1; i++) {
			if((int)name1.charAt(i) - (int)name2.charAt(i) != 0) {
				return -((int)name1.charAt(i) - (int)name2.charAt(i));
			}
		}
		
		if(len1 < len2) {
			return 1;
		} else {
			return -1;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(gdp);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Country other = (Country) obj;
		if (Float.floatToIntBits(gdp) != Float.floatToIntBits(other.gdp))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [Name: "+name+", GDP: "+gdp+"]";
	}
}