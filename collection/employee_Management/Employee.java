package collection.employee_Management;

public class Employee {

	private String employeeName;
	private String employeeID;
	private double salary;
	
	Employee(String employeeName, String employeeID, double salary){
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}


	public String getEmployeeID() {
		return employeeID;
	}


	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "EmployeeName =" + employeeName + ", Employee ID =" + employeeID + ", Salary =" + salary;
	}
	
	
}
