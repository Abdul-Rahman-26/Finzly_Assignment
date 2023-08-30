package collection.schoolManagement;

public class Student {

	public Student(String studentName, String standard, String department) {
		this.studentName = studentName;
		this.standard = standard;
		this.department = department;
	}
	private String studentName;
	private String standard;
	private String department;
	
	public String getStudentName() {
		return studentName;
	}
	
	public String getStandard() {
		return standard;
	}
	
	
	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "StudentName = " + studentName + ", Standard = " + standard + ", Department = " + department;
	}
	
	
}
