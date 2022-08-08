package arrays;

import java.util.Scanner;

public class Array_Student 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Student[] students = new Student[3];
		
		int index = 0;
		while(index < students.length)
		{
			System.out.print("Enter the name of the "+(index+1)+" student: ");
			String name = in.nextLine();
			System.out.print("Enter the class: ");
			int standard = in.nextInt();
			System.out.print("Enter the roll number: ");
			int roll = in.nextInt();
			in.nextLine();
			students[index++] = new Student(name, standard, roll);
		}
		in.close();
		
		System.out.println("----------------------------");
		Student.display(students);
	}
}

class Student
{
	String name;
	int standard;
	int roll;
	
	public Student(String name, int standard, int roll)
	{
		this.name = name;
		this.standard = standard;
		this.roll = roll;
	}
	
	public String toString()
	{
		return "Student["+name+", "+standard+", "+roll+"]";
	}
	
	public static void display(Student[] students)
	{
		for(Student i : students)
			System.out.println(i);
	}
}
