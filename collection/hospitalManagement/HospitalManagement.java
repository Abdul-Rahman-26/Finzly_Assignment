package collection.hospitalManagement;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

import collection.schoolManagement.Teacher;

public class HospitalManagement {
	private static Scanner scanner = new Scanner(System.in);
	private static boolean stop = false;
	public static Map<String,Patient> newPatient = new HashMap<>();
	
	public static void main(String[] args) {
	    while (!stop) {
	        System.out.println("|1 Add Patient \n|2 View Details \n|3 View PatientList \n|4 Exit \n|Select Option:");
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
		switch(option) {
		case 1:
			addPatient();
			break;
		case 2:
			viewDetails();
			break;
		case 3:
			viewPatientList();
			break;
		case 4:
			exit();
			break;
		}
	}

	private static void addPatient() {
		scanner.nextLine();
		System.out.println("Enter the Patient Name:");
		String patientName = scanner.nextLine();
		System.out.println("Enter the Patient ID");
		String patientID = scanner.nextLine();
		System.out.println("Enter the Patient age");
		int patientAge = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Patient issue");
		String issue = scanner.nextLine();
		Patient patient = new Patient(patientName,patientAge, issue);
		newPatient.put(patientID, patient);
	}

	private static void viewDetails() {
		scanner.nextLine();
		System.out.println("Enter the Patient ID");
		String patientID = scanner.nextLine();
		Patient patient = newPatient.get(patientID);
		if(patient != null) {
			System.out.println("Patient Name : "+patient.getPatientName()+" Patient ID : "+patientID+" Patient age : "+patient.getPatientage()+" Patient Issue : "+patient.getIssue());
		}
		else {
			System.out.println("Patient detail not found");
		}
	}

	private static void viewPatientList() {
		System.out.println("The Patient List");
		 for (Map.Entry<String, Patient> patient : newPatient.entrySet()) {
             System.out.println(patient.getValue());
         }
	}

	private static void exit() {
		System.out.println("Thank You!!!");
	}
		
	}
	
