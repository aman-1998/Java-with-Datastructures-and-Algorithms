package shallowCopyAndDeepCopy;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable {
	
	private String name;
	private int roll;
	private int standard;
	private Address address;
	private List<String> subjects = new ArrayList<>();
	
	public Student(String name, int roll, int standard, Address address, List<String> subjects) {
		this.name = name;
		this.roll = roll;
		this.standard = standard;
		this.address = address;
		this.subjects = subjects;
	}
	
	public Student() {}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", standard=" + standard + ", address=" + address
				+ ", subjects=" + subjects + "]";
	}
	
}
