package praktikumpl;

public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public int getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }
}
