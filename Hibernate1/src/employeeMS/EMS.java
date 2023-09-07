package employeeMS;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class EMS {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Operation employeeService = new Operation(sessionFactory);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employee by ID");
            System.out.println("3. List All Employees");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Get Employees with Salary > 30000");
            System.out.println("7. Get Employees in Departments 'developer' and 'tester'");
            System.out.println("8. Get Employees from All Departments Except 'tester'");
            System.out.println("9. Sort Employees by Salary (Descending)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
                    String dob = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    Employee newEmployee = new Employee(firstName, lastName, dob, email, department, salary);
                    employeeService.addEmployee(newEmployee);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int employeeId = scanner.nextInt();
                    Employee retrievedEmployee = employeeService.getEmployeeById(employeeId);
                    if (retrievedEmployee != null) {
                        System.out.println(retrievedEmployee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    List<Employee> allEmployees = employeeService.getAllEmployees();
                    for (Employee employee : allEmployees) {
                        System.out.println(employee);
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateEmployeeId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    Employee updatedEmployee = employeeService.getEmployeeById(updateEmployeeId);
                    if (updatedEmployee != null) {
                        System.out.print("Enter Updated First Name: ");
                        updatedEmployee.setFirstName(scanner.nextLine());
                        System.out.print("Enter Updated Last Name: ");
                        updatedEmployee.setLastName(scanner.nextLine());
                        System.out.print("Enter Updated Email: ");
                        updatedEmployee.setEmail(scanner.nextLine());
                        System.out.print("Enter Updated Department: ");
                        updatedEmployee.setDepartment(scanner.nextLine());
                        System.out.print("Enter Updated Salary: ");
                        updatedEmployee.setSalary(scanner.nextDouble());

                        employeeService.updateEmployee(updatedEmployee);
                        System.out.println("Employee updated successfully!");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteEmployeeId = scanner.nextInt();
                    employeeService.deleteEmployee(deleteEmployeeId);
                    System.out.println("Employee deleted successfully!");
                    break;

                case 6:
                    List<Employee> highSalaryEmployees = employeeService.getEmployeesWithSalaryGreaterThan(30000);
                    for (Employee employee : highSalaryEmployees) {
                        System.out.println(employee);
                    }
                    break;

                case 7:
                    List<Employee> devAndTesterEmployees = employeeService.getEmployeesWithDepartments("developer", "tester");
                    for (Employee employee : devAndTesterEmployees) {
                        System.out.println(employee);
                    }
                    break;

                case 8:
                    List<Employee> nonTesterEmployees = employeeService.getEmployeesFromDepartmentsOtherThan("tester");
                    for (Employee employee : nonTesterEmployees) {
                        System.out.println(employee);
                    }
                    break;

                case 9:
                    List<Employee> sortedEmployees = employeeService.getEmployeesSortedBySalaryDesc();
                    for (Employee employee : sortedEmployees) {
                        System.out.println(employee);
                    }
                    break;

                case 0:
                    // Exit
                    System.out.println("Exiting Employee Management System.");
                    sessionFactory.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
