	package genrics;

import java.util.Optional;

public class Genrics_N1 {
	public static void main(String[] args) {
		Student<Integer, String> student1 = new Student<Integer, String>(135, "Alokik Harsh");
		Student<Integer, String> student2 = new Student<Integer, String>(137, "Alka Prasad");
		Student<Integer, String> student3 = new Student<Integer, String>(138, "Aman Kumar Mishra");
		
		Optional<String> name3 = student3.getNameByRoll(138);
		
		if(name3.isPresent()) {
			System.out.println("Name = "+name3.get());
		} else {
			System.out.println("Name not found");
		}
		
		Optional<Integer> roll = student2.getRollByName("Ankush Prasad");
		
		System.out.println("Roll = "+roll.orElseGet(() -> 0));
	}
}

class Student<U,V> {
	private U roll;
	private V name;
	
	public Student(U roll, V name) {
		this.roll = roll;
		this.name = name;
	}
	
	public Optional<V> getNameByRoll(U roll) {
		if(this.roll.equals(roll)) {
			return Optional.ofNullable(name);
		} else {
			return Optional.ofNullable(null);
		}
	}
	
	public Optional<U> getRollByName(V name) {
		if(this.name.equals(name)) {
			return Optional.ofNullable(roll);
		} else {
			return Optional.ofNullable(null);
		}
	}
}
