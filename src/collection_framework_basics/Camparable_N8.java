package collection_framework_basics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Camparable_N8 {
	public static void main(String[] args) {
		List<Car> cars = new LinkedList<Car>();
		
		cars.add(new Car("XUV 700"));
		cars.add(new Car("Jeep Wrangler"));
		cars.add(new Car("Thar"));
		cars.add(new Car("Scorpio S21"));
		cars.add(new Car("Bolero Neo"));
		cars.add(new Car("Ford Bronco"));
		cars.add(new Car("XUV 300"));
		cars.add(new Car("Toyota Land Cruiser"));
		cars.add(new Car("Toyota Fortuner"));
		cars.add(new Car("Jimmny"));
		cars.add(new Car("XUV 300"));
		
		Display_List<Car> disp = new Display_List<Car>();
		disp.display2(cars);
		System.out.println("----------------------------------------------");
		
		cars.remove(new Car("XUV 300"));
		disp.display2(cars);
		System.out.println("----------------------------------------------");
		
		Collections.sort(cars);
		disp.display2(cars);
		System.out.println("----------------------------------------------");
	}
}

class Car implements Comparable<Car> {
	
	private String name;
	
	public Car(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [Name= " + name + "]";
	}
	
	public int compareTo(Car car) {
		
		String name1 = this.name;
		String name2 = car.name;
//		int len1 = name1.length();
//		int len2 =  name2.length();
//		
//		int min = len1 < len2 ? len1 : len2;
		
//		for(int i = 0; i < min; i++) {
//			if((int)name1.charAt(i) - (int)name2.charAt(i) != 0) {
//				return (int)name1.charAt(i) - (int)name2.charAt(i);
//			}
//		}
		
		if(name1.compareTo(name2) < 0) {
			return -1;
		} else {
			return 1;
		}
		
//		if(len1 < len2)
//			return -1;
//		else
//			return 1;
	}
}