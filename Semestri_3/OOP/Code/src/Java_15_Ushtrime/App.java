package Java_15_Ushtrime;

public class App {

    public static void main(String[] args) {
        Store s = new Store();

        Product p1 = new Product(
                "Laptop HP",
                950.8, 5,
                ProductCategory.ELECTRONICS
        );
        Product p2 = new Product(
                "IPhone 15",
                1800, 3,
                ProductCategory.ELECTRONICS
        );

        s.addProduct(p1);
        s.addProduct(p2);

        ShoppingCart s1 = new ShoppingCart();
        s1.addProduct(p2);
        s1.addProduct(p2);

        Order o1 = new Order(
                new Customer("123", "Bob"),
                s1.getProducts(),
                s1.calculateTotalCost()
        );

        s.addOrder(o1);
        s.viewAllOrders();
        s.viewEntireCatalog();

        System.out.println("\nEnumeration values");
        
        for (ProductCategory p : ProductCategory.values())
            System.out.println(p);
    }
}





