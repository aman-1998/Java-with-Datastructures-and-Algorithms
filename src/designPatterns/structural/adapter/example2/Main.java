package designPatterns.structural.adapter.example2;
/*
 * 
 * Usage: 
 * 1. Arrays.asList(1, 2, 3)
 * 
 * When to use:
 * When an Interface is not compatible with a class but we still want to implement that interface. 
 * This is generally used when we write new codes and make them compatible with older codes. 
 * So, we make adapter class for newClasses so that they become compatible with older interfaces.
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Student student1 = new CollegeStudent("Ravi", "ravi.mishra@gmail.com", "CSE");
		//Student student2 = new SchoolStudent("Aman", "aman.iyer@gmail.com", "XII");
		Student student2 = new SchoolStudentAdapter(new SchoolStudent("Aman", "aman.iyer@gmail.com", "XII"));
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		
		studentList.stream().forEach(student -> System.out.println(student.getName() + " | " + student.getEmailId() + " | " + student.getDepartment()));
	}
}
