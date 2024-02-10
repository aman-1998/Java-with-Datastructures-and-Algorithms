package shallowCopyAndDeepCopy;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
	
	private String name;
	private int id;
	private String department;
	private Address address;
	private List<String> projects = new ArrayList<>();
	
	public Employee(String name, int id, String department, Address address, List<String> projects) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.address = address;
		this.projects = projects;
	}

	public Employee() {}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Employee employee = new Employee();
		employee.setName(this.name);
		employee.setId(this.id);
		employee.setDepartment(this.department);
		
		Address address = new Address(this.getAddress().getTemporary(), this.getAddress().getPermanent());
		
		List<String> projects = new ArrayList<String>();
		
		for(String project : this.getProjects()) {
			projects.add(project);
		}
		
		employee.setAddress(address);
		employee.setProjects(projects);
		
		return employee;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<String> getProjects() {
		return projects;
	}
	
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", address=" + address
				+ ", projects=" + projects + "]";
	}
	
}
