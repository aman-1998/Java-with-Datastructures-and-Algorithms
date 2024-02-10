package shallowCopyAndDeepCopy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Shallow_Copy {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Aman", 137, 4, new Address("Kolkata", "Darbhanga"), Stream.of("Hindi", "English", "Math", "Science").collect(Collectors.toList()));
		
		System.out.println(student1);
		
		try {
			Student student2 = (Student) student1.clone();
			
			Address address = student1.getAddress();
			address.setTemporary("Banglore");
			address.setPermanent("Haryana");
			
			List<String> subjects = student1.getSubjects();
			subjects.remove("Math");
			subjects.remove("Science");
			
			System.out.println(student1);
			
			System.out.println(student2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
