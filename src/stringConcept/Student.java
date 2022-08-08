package stringConcept;

public class Student
{
	private String name;
	private int roll;
	
	public Student(String name, int roll)
	{
		this.name = name;
		this.roll = roll;
	}
	
	//overriding toString()
	public String toString()
	{
		return "Name : "+name+" || Roll : "+roll;
	}
	
	//overriding equals()
	public boolean equals(Student st)
	{
		return (this.name.equals(st.name)) && (this.roll == st.roll);
	}
	
	public String getName()
	{
		return name;
	}
	public int getRoll()
	{
		return roll;
	}
}
