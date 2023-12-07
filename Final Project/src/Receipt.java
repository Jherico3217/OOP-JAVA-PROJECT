import java.util.ArrayList;
import java.util.List;
class Receipt {
    private Student student;
    private List<Transaction> transactions;

    public Receipt(Student student) {
        this.student = student;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void generateReceipt() {
        double totalAmount = calculateTotalAmount();

        System.out.println("Receipt for " + student.getName() + " (Year " + student.getYearLevel() + "):");
        System.out.println("Transactions:");

        for (Transaction transaction : transactions) {
            displayTransactionDetails(transaction);
        }

        displayTotalAmount(totalAmount);
    }

    private double calculateTotalAmount() {
        double totalAmount = 0;
        for (Transaction transaction : transactions) {
            totalAmount += transaction.getAmount();
        }
        return totalAmount;
    }

    private void displayTransactionDetails(Transaction transaction) {
        System.out.println("Transaction ID: " + transaction.getTransactionId() + ", Amount: ₱" + transaction.getAmount());
    }

    private void displayTotalAmount(double totalAmount) {
        System.out.println("Total Amount: ₱" + totalAmount);
    }
}