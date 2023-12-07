import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you an admin or a user? (Enter 'admin' or 'user'): ");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("admin")) {
            Admin admin = new Admin();
            System.out.print("Enter admin username: ");
            String adminUsername = scanner.nextLine();
            System.out.print("Enter admin password: ");
            String adminPassword = scanner.nextLine();

            if (admin.login(adminUsername, adminPassword)) {
                System.out.print("Admin login successful!");

                // Perform admin-specific operations

            } else {
                System.out.print("Invalid admin credentials. Login failed.");
            }
        } else if (userType.equalsIgnoreCase("user")) {
            User user = new User();
            System.out.print("Enter user username: ");
            String userUsername = scanner.nextLine();
            System.out.print("Enter user password: ");
            String userPassword = scanner.nextLine();

            if (user.login(userUsername, userPassword)) {
                System.out.println("User login successful!");

                Student student = new Student("Alice Mendoza", 2);
                Receipt receipt = new Receipt(student);
                receipt.addTransaction(new Transaction ("T001", 75.50));
                receipt.addTransaction(new Transaction ("T002", 60.25));
                receipt.addTransaction(new Transaction ("T003", 50.75));
                receipt.generateReceipt();

            } else {
                System.out.println("Invalid user credentials. Login failed.");
            }
        } else {
            System.out.println("Invalid input. Please enter 'admin' or 'user'.");
        }
        scanner.close();
    }
}