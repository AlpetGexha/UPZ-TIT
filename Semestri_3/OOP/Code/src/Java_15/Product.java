package Java_15;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private ProductCategory category;

    public Product(String n, double p, int q, ProductCategory c) {
        name = n;
        price = p;
        quantity = q;
        category = c;
    }

    public String toString() {
        return "Name: " + name + ", Price: " + price
                + ", Quantity: " + quantity + ", Category: "
                + category;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}