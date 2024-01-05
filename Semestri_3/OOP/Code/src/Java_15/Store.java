package Java_15;

import java.util.ArrayList;

public class Store {

    private final ArrayList<Product> products;
    private final ArrayList<Order> orders;

    public Store() {
        products = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void viewAllOrders() {
        System.out.println("-----------ORDERS-----------");
        int i = 0;
        for (Order o : orders) {
            System.out.println("Order " + (++i));
            System.out.println(o + "\n");
        }
        System.out.println("----------------------------");
    }

    public void viewEntireCatalog() {
        System.out.println("-----------PRODUCT CATALOG-----------");
        int i = 0;
        for (Product p : products) {
            System.out.println("Product " + (++i));
            System.out.println(p + "\n");
        }
        System.out.println("--------------------------------------");
    }
}