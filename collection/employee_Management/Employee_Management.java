package collection.employee_Management;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Employee_Management {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static boolean stop = false;
	
	public static List<Employee> employee = new ArrayList<>();
	
	public static void main(String[] args) {
		
		while (!stop) {
            System.out.println("|1 Add Employee\n|2 Display\n|3 Search\n|4 Exit \n|Select your Options:");
            
            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();

                if (isValid(option)) {
                    options(option);
                } else {
                    System.out.println("Invalid input. Please enter a valid numeric option.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric option.");
                scanner.next();
            }
        }
	}

	private static boolean isValid(int option) {
	    return option >= 1 && option <= 4; 
	}


	private static void options(int option) {
		switch(option) {
		case 1 :
			addEmployee();
			break;
		case 2:
			display();
			break;
		case 3:
			searchEmployee();
			break;
		case 4:
			exit();
			break;
		default : 
			System.out.println("Invalid - select between 1-4");
			break;
		}
		
		}


	private static void addEmployee() {
		scanner.nextLine();
		System.out.println("Enter the Name of Employee :");
		String employeeName = scanner.nextLine();
		System.out.println("Enter the Employee ID :");
		String employeeID = scanner.nextLine();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		Employee employer = new Employee(employeeName, employeeID, salary);
		employee.add(employer);
		
	}
	private static void display() {
		scanner.nextLine();
		System.out.println("The Employees are : ");
		int index = 1;
		for(Employee employer : employee) {
			System.out.println(index++ +" "+ employer);
		}
	}

	private static void searchEmployee() {
		scanner.nextLine();
		System.out.println("Enter the Employee ID: ");
		String employeeID = scanner.nextLine();
		for(Employee employer : employee) {
			if(employeeID.equals(employer.getEmployeeID()) ) {
				System.out.println(employer);
			}
			else {
				System.out.println("Employee Not found");
			}
		}
	}
	private static void exit() {
		System.out.println("Thank you !!!");
		stop = true;
	}

	
	}