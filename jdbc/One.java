package jdbc;

import java.sql.*;
import java.util.Scanner;

public class One {

    private static boolean stop = false;
    private static Scanner scanner = new Scanner(System.in);
    private static Connection connection;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "password");
        createTableIfNotExists();

        while (!stop) {
            options();
        }

        connection.close();
    }

    private static void createTableIfNotExists() {
        try {
            String createTableQuery = "CREATE TABLE IF NOT EXISTS Login (username VARCHAR(255), password VARCHAR(255), logined INT)";
            Statement createTableStatement = connection.createStatement();
            createTableStatement.execute(createTableQuery);
            createTableStatement.close();
            System.out.println("Table 'Login' created or already exists.");
        } catch (SQLException e) {
            System.err.println("Error creating table: " + e.getMessage());
        }
    }

    private static void options() {
        System.out.println("Enter the option \n|1 Insert data \n|2 Delete \n|3 Update \n|4 Show\n|5 Exit");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:
                insert();
                break;
            case 2:
                delete();
                break;
            case 3:
                update();
                break;
            case 4:
                show();
                break;
            case 5:
                System.out.println("Exited");
                stop = true;
                break;
            default:
                System.out.println("Invalid option. Please enter a valid choice.");
        }
    }

    private static void insert() {
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            System.out.print("Is logined (1 for true, 0 for false): ");
            int logined = scanner.nextInt();

            String insertQuery = "INSERT INTO Login (username, password, logined) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setInt(3, logined);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Data insertion failed.");
            }

            preparedStatement.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void delete() {
        try {
            System.out.print("Enter username to delete: ");
            String username = scanner.nextLine();

            String deleteQuery = "DELETE FROM Login WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1, username);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("Data deletion failed. User not found.");
            }

            preparedStatement.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static void update() {
        try {
            System.out.print("Enter username to update: ");
            String username = scanner.nextLine();

            System.out.print("Enter new password: ");
            String newPassword = scanner.nextLine();

            System.out.print("Is logined (1 for true, 0 for false): ");
            int logined = scanner.nextInt();

            String updateQuery = "UPDATE Login SET password = ?, logined = ? WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setInt(2, logined);
            preparedStatement.setString(3, username);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data updated successfully!");
            } else {
                System.out.println("Data update failed. User not found.");
            }

            preparedStatement.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static void show() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Login");

            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                int logined = resultSet.getInt("logined");

                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("Is Logined: " + (logined == 1 ? "true" : "false"));
                System.out.println("-----------------------");
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
