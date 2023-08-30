package collection.schoolManagement;

public class Teacher {

	public Teacher(String teacherName, String department, double salary) {
		super();
		this.teacherName = teacherName;
		this.department = department;
		this.salary = salary;
	}
	private String teacherName;
	private String department;
	private double salary;
	
	public String getStudentName() {
		return teacherName;
	}
	
		
	public String getDepartment() {
		return department;
	}
	
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "TeacherName = " + teacherName + ", Department = " + department + ", Salary = " + salary ;
	}
	
}

