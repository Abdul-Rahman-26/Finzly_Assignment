import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Student");
            System.out.println("2. Retrieve Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addStudent(scanner, studentDAO);
                    break;
                case 2:
                    retrieveStudent(scanner, studentDAO);
                    break;
                case 3:
                    updateStudent(scanner, studentDAO);
                    break;
                case 4:
                    deleteStudent(scanner, studentDAO);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
        HibernateUtil.closeSessionFactory();
    }

    private static void addStudent(Scanner scanner, StudentDAO studentDAO) {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Student student = new Student(firstName, lastName, email);
        studentDAO.addStudent(student);

        System.out.println("Student added successfully!");
    }

    private static void retrieveStudent(Scanner scanner, StudentDAO studentDAO) {
        System.out.print("Enter student ID to retrieve: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Student student = studentDAO.getStudent(id);

        if (student != null) {
            System.out.println("Retrieved Student: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void updateStudent(Scanner scanner, StudentDAO studentDAO) {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Student existingStudent = studentDAO.getStudent(id);

        if (existingStudent != null) {
            System.out.print("Enter new first name: ");
            String newFirstName = scanner.nextLine();

            System.out.print("Enter new last name: ");
            String newLastName = scanner.nextLine();

            System.out.print("Enter new email: ");
            String newEmail = scanner.nextLine();

            existingStudent.setFirstName(newFirstName);
            existingStudent.setLastName(newLastName);
            existingStudent.setEmail(newEmail);

            studentDAO.updateStudent(existingStudent);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void deleteStudent(Scanner scanner, StudentDAO studentDAO) {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Student student = studentDAO.getStudent(id);

        if (student != null) {
            studentDAO.deleteStudent(student);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}
