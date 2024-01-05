package Java_15;

import java.util.ArrayList;

public class ShoppingCart {

    private final ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public String toString() {
        return products.toString();
    }

    public void addProduct(Product p) {
        if (p.getQuantity() == 0) {
            System.out.println("Ky produkt nuk gjendet ne stok...");
            return;
        }
        products.add(p);
        p.setQuantity(p.getQuantity() - 1);
    }

    public void removeProduct(Product p) {
        products.remove(p);
        p.setQuantity(p.getQuantity() + 1);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product p : products)
            totalCost += p.getPrice();
        return totalCost;
    }
}





