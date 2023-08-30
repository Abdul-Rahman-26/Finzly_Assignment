package collection.projectManagementSystem;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class ProjectManagementSystem {
	
	private static Scanner scanner = new Scanner(System.in);
	private static boolean stop = false;
	public static Map<String,Project> projects = new HashMap<>();
	
	public static void main(String[] args) {
	
		while(!stop) {
			System.out.println("|1 Add Projects\n|2 Assign TeamMembers\n|3 View Project Details\n|4 List All Projects\n|5 Exit\nSelect the option :");
			if(scanner.hasNextInt()) {
				int option = scanner.nextInt();
				options(option);
				
			}else {
				System.out.println("Invaild Option...Please,Select the Valid");
			}
		}
		scanner.close();
	}

	private static void options(int option) {
		switch(option) {
		case 1:
			addProjects();
			break;
		case 2:
			assignTeamMembers();
			break;
		case 3:
			viewProject();
			break;
		case 4:
			listAllProject();
			break;
		case 5:
			exit();
			break;
		default:
			System.out.println("Invalid Option..Select the correct Option");
		}
	}

	private static void addProjects() {
		scanner.nextLine();
		System.out.println("Enter the Project ID : ");
		String projectID = scanner.nextLine();
		System.out.println("Enter the Project Name :");
		String projectName = scanner.nextLine();
		System.out.println("Enter the Project Description");
		String projectdescription = scanner.nextLine();
		Project project = new Project(projectName, projectdescription);
		projects.put(projectID, project);
	}

	private static void assignTeamMembers() {
		scanner.nextLine();
		System.out.println("Enter the Project ID: ");
		String projectID = scanner.nextLine();
		Project project = projects.get(projectID);
		if(project != null) {
			System.out.println("Enter the Team Member");
			String teamMember = scanner.nextLine();
			project.addTeamMember(teamMember);
			System.out.println("Sucessfully Added");
		}
		else {
			System.out.println("Invalid ... Please Enter the valid Project ID");
		}
	}

	private static void viewProject() {
		scanner.nextLine();
		System.out.println("Enter the Project ID");
		String projectID = scanner.nextLine();
		Project project = projects.get(projectID);
		if(project != null) {
			System.out.println(project);
		}
		else {
			System.out.println("Invalid, Not found");
		}
	}

	private static void listAllProject() {
		System.out.println("List of All projects ");
		for(Map.Entry<String,Project> entry : projects.entrySet()) {
			System.out.print("Project ID = "+ entry.getKey());
			System.out.println(entry.getValue());
			
			
		}
	}

	private static void exit() {
		System.out.println("Thank you !!!");
		stop = true;
	}

}
