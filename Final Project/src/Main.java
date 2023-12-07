import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CashierSystem cashierSystem = new CashierSystem();

        while (true) {
            System.out.println("Main Menu: ");
            System.out.println("1. Admin");
            System.out.println("2. Client");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adminInterface(scanner, cashierSystem);
                    break;
                case 2:
                    clientInterface(scanner, cashierSystem);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    private static void adminInterface(Scanner scanner, CashierSystem cashierSystem) {
        while (true) {
            System.out.println("Admin Interface:");
            System.out.println("1. Add Transaction");
            System.out.println("2. Remove Transaction");
            System.out.println("3. View Transaction History");
            System.out.println("4. Back to Main Menu");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter client name: ");
                    String clientName = scanner.nextLine();
                    System.out.println("Enter product: ");
                    String product = scanner.nextLine();
                    System.out.println("Enter price: ");
                    double price = scanner.nextDouble();
                    cashierSystem.addTransaction(clientName, product, price);
                    break;
                case 2:
                    System.out.println("Enter index of transaction to remove: ");
                    int index = scanner.nextInt();
                    cashierSystem.removeTransaction(index);
                    break;
                case 3:
                    cashierSystem.viewTransactionHistory();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void clientInterface(Scanner scanner, CashierSystem cashierSystem) {
        System.out.println("Enter client name: ");
        String clientName = scanner.nextLine();
        cashierSystem.viewTransactions(clientName);
    }
}