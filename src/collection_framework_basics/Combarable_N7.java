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
	
	public int compareTo(Employee emp) {
		
		if(this.id > emp.id) {
			return -1;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return "[ID: " + id + ", Name: " + empName + "]";
	}
}
