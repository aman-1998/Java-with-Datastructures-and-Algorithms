package java_8_features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class Stream_N11 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(123, "Aman Kumar Mishra"));
		list.add(new Employee(143, "Vimal Paan"));
		list.add(new Employee(162, "Nikita Kushwaha"));
		list.add(new Employee(151, "Sneha Barnwal"));
		list.add(new Employee(140, "Vivek Agarwal"));
		list.add(new Employee(129, "Chandni Manchanda"));
		
		list = list.stream() // ascending order of id
					.sorted((employee1, employee2) -> employee1.getId() > employee2.getId() ? 1 : -1)
					.collect(Collectors.toList());
		
		list.forEach(employee -> System.out.println(employee));
		
		System.out.println("-----------------------------------------------------------");
		
		list.stream().sorted((employee1, employee2) -> employee1.getName().compareTo(employee2.getName()))
					 .forEach(employee -> System.out.println(employee)); // ascending order of Name
		
		
		System.out.println("-----------------------------------------------------------");
		
		
		list.clear();
		//list.removeIf(element -> element instanceof Employee);
		
		list.add(new Employee(123, "Aman Kumar Mishra"));
		list.add(new Employee(143, "Vimal Paan"));
		list.add(new Employee(162, "Nikita Kushwaha"));
		list.add(new Employee(151, "Sneha Barnwal"));
		list.add(new Employee(140, "Vivek Agarwal"));
		list.add(new Employee(129, "Chandni Manchanda"));
		
		list = list.stream().sorted(Comparator.comparing(employee -> employee.getId())).collect(Collectors.toList());
		list.stream().forEach(employee -> System.out.println(employee)); // Ascending order of Id
		
		System.out.println("-----------------------------------------------------------");
		
		list.clear();
		//list.removeIf(element -> element instanceof Employee);
		
		list.add(new Employee(123, "Aman Kumar Mishra"));
		list.add(new Employee(143, "Vimal Paan"));
		list.add(new Employee(162, "Nikita Kushwaha"));
		list.add(new Employee(151, "Sneha Barnwal"));
		list.add(new Employee(140, "Vivek Agarwal"));
		list.add(new Employee(129, "Chandni Manchanda"));
		
		list = list.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
		list.stream().forEach(employee -> System.out.println(employee)); // Ascending order of
		
		System.out.println("-----------------------------------------------------------");
		
		list = list.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
		list.stream().forEach(employee -> System.out.println(employee));
		
		System.out.println("-----------------------------------------------------------");
		
		list.clear();
		//list.removeIf(element -> element instanceof Employee);
		
		list.add(new Employee(123, "Aman Kumar Mishra"));
		list.add(new Employee(143, "Vimal Paan"));
		list.add(new Employee(162, "Nikita Kushwaha"));
		list.add(new Employee(151, "Sneha Barnwal"));
		list.add(new Employee(140, "Vivek Agarwal"));
		list.add(new Employee(129, "Chandni Manchanda"));
		
		list = list.stream().sorted(Comparator.comparing(Employee::getId).reversed()).collect(Collectors.toList());
		list.stream().forEach(employee -> System.out.println(employee)); // Descending order
		
		System.out.println("-----------------------------------------------------------");
		
		Employee employeeWithMaxId = list.stream().max(Comparator.comparing(employee -> employee.getId())).orElseGet(() -> new Employee(200, "Bhoot"));
		System.out.println(employeeWithMaxId);
		
		System.out.println("-----------------------------------------------------------");
		
		Employee employeeWithMinId = list.stream().min(Comparator.comparing(Employee::getId)).get();
		System.out.println(employeeWithMinId);
		
		System.out.println("-----------------------------------------------------------");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Aman Mishra");
		list2.add("Radhika Rathi");
		list2.add("Suman Jha");
		list2.add("Nikhil Sharma");
		list2.add("Raman Reddy");
		list2.add("Ankit Anand");
		list2.add("Pankhuri Singh Rajpoot");
		list2.add("Varsh Nayak");
		list2.add("Rahul Patel");
		
		String largetsName = list2.stream().max(Comparator.comparing(name -> name.length())).get();
		System.out.println(largetsName);
		
		largetsName = list2.stream().sorted((name1, name2) -> name1.length() > name2.length() ? -1 : 1).findFirst().get();
		System.out.println(largetsName);
		
		largetsName = list2.stream().reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2).get();
		System.out.println(largetsName);
	}
}
