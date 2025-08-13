package designPatterns.creational.singleton.immutable;

import java.util.Date;

/*
 * Immutable class:
 * 
 * 1. Make class final
 * 2. Make attributes final
 * 3. Initialize attributes using constructor (use defensive copies)
 * 4. Don't make setters
 * 5. Make getters that return defensive copies.
 */
public final class Employee { // Immutable class
	
	private final int id;
	
	private final String name;
	
	private final Date dob;
	
	private final Address address;
	
	public Employee(int id, String name, Date dob, Address address) {
		
		this.id = id;
		this.name = name;
		this.dob = new Date(dob.getTime());
		this.address = new Address(address.getCity(), address.getState(), 
				                   address.getStreet(), address.getZipCode());
	}

	public int getId() {
		return id;
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
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + "]";
	}
	
}
