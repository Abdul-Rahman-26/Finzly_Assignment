package collection.schoolManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import collection.bankApplication.Account;

public class StudentManagementSystem {
	
	private static Scanner scanner = new Scanner(System.in);
    public static boolean stop = false;
    public static Map<Long, Student> newStudent = new HashMap<>();
    public static Map<String,Teacher> newTeacher = new HashMap<>();


	public static void main(String[] args) {
	        while (!stop) {
	            System.out.println("|1 Add Student \n|2 Add Teacher \n|3 Display \n|4 Exit\n|Select Option:");
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
	        scanner.close();
	    }
    private static boolean isValid(int option) {
        return option >= 1 && option <= 4;
    }

    private static void options(int option) {
        switch (option) {
            case 1:
                addStudent();
                break;
            case 2:
                addTeacher();
                break;
            case 3:
                display();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Enter the Valid option");
                break;
        }
    }
	private static void addStudent() {
		scanner.nextLine();
		System.out.println("Enter the Student Name");
		String studentName = scanner.nextLine();
		System.out.println("Enter the Student RollNo");
		long studentNo = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter the Student Standard");
		String studentst = scanner.nextLine();
		System.out.println("Enter the Student Department");
		String studentdept = scanner.nextLine();
		Student student = new Student(studentName, studentst, studentdept);
		newStudent.put(studentNo, student);
		
		
	}
	private static void addTeacher() {
		scanner.nextLine();
		System.out.println("Enter the Teacher Name");
		String teacherName = scanner.nextLine();
		System.out.println("Enter the Teacher's ID");
		String teacherNo = scanner.nextLine();
		System.out.println("Enter the Teacher's Salary");
		double teacherSalary = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter the Teacher Department");
		String teacherdept = scanner.nextLine();
		Teacher teacher = new Teacher(teacherName, teacherdept, teacherSalary);
		newTeacher.put(teacherNo, teacher);
		
	}
	private static void display() {
	    scanner.nextLine();
	    System.out.println("|1 Student Details\n|2 Teacher Details");
	    int option = scanner.nextInt();
	    switch (option) {
	        case 1:
	            System.out.println("Students Details:");
	            for (Map.Entry<Long, Student> student : newStudent.entrySet()) {
	                System.out.println(student.getValue());
	            }
	            break;
	        case 2:
	            System.out.println("Teachers Details:");
	            for (Map.Entry<String, Teacher> teacher : newTeacher.entrySet()) {
	                System.out.println(teacher.getValue());
	            }
	            break;
	        default:
	            System.out.println("invalid input");
	            break;
	    }
	}

	private static void exit() {
		System.out.println("Thank you !!!");
		stop = true;
	}

	}

