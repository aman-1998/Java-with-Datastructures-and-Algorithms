package designPatterns.structural.adapter.example2;

public class SchoolStudentAdapter implements Student {
	
	private SchoolStudent schoolStudent;
	
	public SchoolStudentAdapter(SchoolStudent schoolStudent) {
		this.schoolStudent = schoolStudent;
	}
	
	@Override
	public String getName() {
		return this.schoolStudent.getStudentName();
	}
	
	@Override
	public String getEmailId() {
		return this.schoolStudent.getStudentEmailId();
	}
	
	@Override
	public String getDepartment() {
		return "NA";
	}
	
	public String getStandard() {
		return this.schoolStudent.getStandard();
	}
	
}
