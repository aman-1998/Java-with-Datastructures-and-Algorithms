package collection_framework_basics;

import java.util.ArrayList;
import java.util.Collections;

public class Combarable_N7 {
	public static void main(String[] args) {
		ArrayList<Employee> empList;
		empList = new ArrayList<Employee>();
		
		empList.add(new Employee(10937, "Aman Kumar Mishra"));
		empList.add(new Employee(10935, "Amit Gupta"));
		empList.add(new Employee(10939, "Mala Das"));
		empList.add(new Employee(10931, "Buttu Srivastav"));
		empList.add(new Employee(10932, "Priya Kumari"));
		
		Display_List<Employee> disp = new Display_List<Employee>();
		disp.display2(empList);
		System.out.println("\n--------------------------------------------");
		
		Collections.sort(empList);
		disp.display2(empList);
		System.out.println("\n--------------------------------------------");
		
		Collections.reverse(empList);
		disp.display2(empList);
		System.out.println("\n--------------------------------------------");
	}
}

class Employee implements Comparable<Employee> {
	
	private String empName;
	private int id;
	
	public Employee(int id, String empName) {
		this.id = id;
		this.empName = empName;
	}
	
	@Override
	public int compareTo(Employee emp) {
		
		if(this.id > emp.id) {
			return -1; // order remains same => don't swap
		} else {
			return 1; // swap
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + id;
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
		Employee other = (Employee) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[ID: " + id + ", Name: " + empName + "]";
	}
}
