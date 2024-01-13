package Java_15_Ushtrime;

import java.util.ArrayList;

public class Order {

    private final Customer customer;
    private final ArrayList<Product> products;
    private final double totalCost;

    public Order(Customer c, ArrayList<Product> p, double t) {
        customer = c;
        products = p;
        totalCost = t;
    }

    public String toString() {
        return "Customer: " + customer
                + "\nProducts: " + products
                + "\nTotal cost: " + totalCost;
    }
}



