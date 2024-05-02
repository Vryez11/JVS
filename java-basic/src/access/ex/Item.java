package access.ex;

public class Item {
    private String productName;
    private int price;
    private int amount;

    public Item(String name, int price, int amount) {
        this.productName = name;
        this.price = price;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }
    public int getTotalPrice() {
        return price * amount;
    }
}
