package shallowCopyAndDeepCopy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Deep_Copy {
	
public static void main(String[] args) {
		
		Employee employee1 = new Employee("Aman", 137, "Software Development", new Address("Kolkata", "Darbhanga"), Stream.of("P1", "P2", "P3", "P4").collect(Collectors.toList()));
		
		System.out.println(employee1);
		
		try {
			Employee employee2 = (Employee) employee1.clone();
			
			Address address = employee1.getAddress();
			address.setTemporary("Banglore");
			address.setPermanent("Haryana");
			
			List<String> projects = employee1.getProjects();
			projects.remove("P2");
			projects.remove("P1");
			
			System.out.println(employee1);
			
			System.out.println(employee2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
