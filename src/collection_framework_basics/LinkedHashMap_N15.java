package collection_framework_basics;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_N15 {
	public static void main(String[] args) {
		Map<Fighter_Jet, String> map = new LinkedHashMap<Fighter_Jet, String>();
		
		map.put(new Fighter_Jet("FA-18 Super Hornet", 670), "USA");
		map.put(new Fighter_Jet("SU-57", 850), "Russia");
		map.put(new Fighter_Jet("AMCA", 1120), "India");
		map.put(new Fighter_Jet("F-22 Raptor", 1640), "USA");
		map.put(new Fighter_Jet("Rafale F4", 960), "France");
		map.put(new Fighter_Jet("Tejas MK2", 700), "India");
		map.put(new Fighter_Jet("J-20", 1230), "China");
		
		Display_Map<Fighter_Jet, String> disp = new Display_Map<Fighter_Jet, String>();
		disp.display2(map);
		System.out.println("--------------------------------------------");
		
		map.put(new Fighter_Jet("Tejas MK2", 700), "India");
		disp.display2(map);
		System.out.println("--------------------------------------------");
	}
}

class Fighter_Jet {
	private String name;
	private int price;
	
	public Fighter_Jet(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Fighter_Jet [Name: "+name+", Price: "+price+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
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
		Fighter_Jet other = (Fighter_Jet) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
}