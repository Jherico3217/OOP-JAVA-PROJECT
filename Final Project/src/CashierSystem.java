import java.util.List;
import java.util.ArrayList;

class CashierSystem {
    private List<Transaction> transactions;

    public CashierSystem() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String clientName, String product, double price) {
        Transaction transaction = new Transaction(clientName, product, price);
        transactions.add(transaction);
        System.out.println("Transaction added successfully.");
    }

    public void removeTransaction(int index) {
        if (index >= 0 && index < transactions.size()) {
            transactions.remove(index);
            System.out.println("Transaction removed successfully.");
        } else {
            System.out.println("Invalid transaction index.");
        }
    }

    public void viewTransactions(String clientName) {
        System.out.println("Transactions for client " + clientName + ":");
        double totalPayment = 0.0;
        for (Transaction transaction : transactions) {
            if (transaction.getClientName().equals(clientName)) {
                System.out.println(transaction);
                totalPayment += transaction.getPrice();
            }
        }
        System.out.println("Total Payment: ₱" + totalPayment);
    }

    public void viewTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}