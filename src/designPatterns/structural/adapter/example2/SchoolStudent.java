package designPatterns.structural.adapter.example2;

public class SchoolStudent {
	
	private String studentName;
	private String studentEmailId;
	private String standard;
	
	public SchoolStudent(String studentName, String studentEmailId, String standard) {
		this.studentName = studentName;
		this.studentEmailId = studentEmailId;
		this.standard = standard;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentEmailId() {
		return studentEmailId;
	}
	
	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}
	
	public String getStandard() {
		return standard;
	}
	
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
}
