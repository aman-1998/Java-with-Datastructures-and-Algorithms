package designPatterns.creational.singleton.immutable;

import java.util.Date;

/*
 * A class that is both immutable and singleton
 */
public final class Student {
	
	private final int roll;
	
	private final String name;
	
	private final Date dob;
	
	private final Address address;
	
	private static final Student student = new Student(
			1,
			"Aman",
			new Date(),
			new Address("Kolkata", "Delhi", "MG Road", 110001)
	);
	
	private Student(int id, String name, Date dob, Address address) {
		this.roll = id;
		this.name = name;
		this.dob = new Date(dob.getTime());
		this.address = new Address(address.getCity(), address.getState(), 
				                   address.getStreet(), address.getZipCode());
	}
	
	public static Student getInstance() {
		return student;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return new Date(dob.getTime());
	}

	public Address getAddress() {
		return new Address(address.getCity(), address.getState(), 
                address.getStreet(), address.getZipCode());
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", dob=" + dob + ", address=" + address + "]";
	}

}
