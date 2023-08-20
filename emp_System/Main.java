package emp_System;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Manager> managers = new ArrayList<>();
    private static List<Developer> developers = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please select:\n1 Add Manager\n2 Add Developer\n3 Display All Data\n4 Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addManager();
                    break;
                case 2:
                    addDeveloper();
                    break;
                case 3:
                    displayData();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static void addManager() {
        System.out.println("Enter the Manager Name: ");
        String managername = sc.nextLine();
        System.out.println("Enter the Manager ID: ");
        int managerID = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the Manager Department: ");
        String managerdept = sc.nextLine();

        Manager m = new Manager(managerID, managername, managerdept);
        managers.add(m);
    }

    private static void addDeveloper() {
        System.out.println("Enter the Developer Name: ");
        String developername = sc.nextLine();
        System.out.println("Enter the Developer ID: ");
        int developerID = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the Developer Programming Language: ");
        String developerpl = sc.nextLine();

        Developer d = new Developer(developerID, developername, developerpl);
        developers.add(d);
    }

    private static void displayData() {
        System.out.println("Manager Details:");
        for (Manager m : managers) {
            System.out.println("Name: " + m.getname());
            System.out.println("ID: " + m.getID());
            System.out.println("Department: " + m.getDepartment());
            System.out.println();
        }

        System.out.println("Developer Details:");
        for (Developer d : developers) {
            System.out.println("Name: " + d.getname());
            System.out.println("ID: " + d.getID());
            System.out.println("Programming Language: " + d.getProgrammingLanguage());
            System.out.println();
        }
    }
}
