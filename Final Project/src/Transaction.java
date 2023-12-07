class Transaction {
    private String clientName;
    private String product;
    private double price;

    public Transaction(String clientName, String product, double price) {
        this.clientName = clientName;
        this.product = product;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public String toString() {
        return "Client: " + clientName + ", Product: " + product + ", Price: ₱" + price;
    }

    public double getPrice() {
        return price;
    }
}