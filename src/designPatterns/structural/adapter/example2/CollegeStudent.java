package designPatterns.structural.adapter.example2;

public class CollegeStudent implements Student {
	
	private String name;
	private String emailId;
	private String department;
	
	public CollegeStudent(String name, String emailId, String department) {
		this.name = name;
		this.emailId = emailId;
		this.department = department;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getEmailId() {
		return emailId;
	}
	
	@Override
	public String getDepartment() {
		return department;
	}


}
