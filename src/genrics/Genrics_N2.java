package genrics;

public class Genrics_N2 {
	public static void main(String[] args) {
		Employee<String>[] employee = new Employee[3];
		employee[0] = new Employee<String>("Aman");
		employee[1] = new Employee<String>("Raghaw");
		employee[2] = new Employee<String>("Madhav");
		
		Display<Employee<String>> disp = new Display<>();
		disp.display(employee);
	}
}

class Display<T> {
	
	public void display(T[] employee) {
		for(T emp : employee) {
			System.out.println(emp);
		}
	}
}

class Employee<U> {
	private U name;
	
	public Employee(U name) {
		this.name = name;
	}
	
	public String toString() {
		return name.toString();
	}
}
