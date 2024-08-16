import java.sql.*;
import javautil.Scanner;

class RestaurantManagementCLI {
    private static Connection connection;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "username", "password");
            System.out.println("Connected to the database");

            while (true) {
                System.out.println("\nRestaurant Management System - Command Line Interface");
                System.out.println("1. Add food item");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addFoodItem();
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addFoodItem() {
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter food name: ");
        String name = scanner.nextLine();

        System.out.print("Enter food price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter food quantity: ");
        int quantity = scanner.nextInt();

        try {
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO food (food_name, price, quantity) VALUES (?, ?, ?)");
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, quantity);

            pstmt.executeUpdate();
            System.out.println("Food item added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}