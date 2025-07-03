
public class InventorySystem {
    public static void main(String[] args) {
        Product product = new Product("Smartphone", 799.99, 20);
        Customer customer = new Customer("John Doe", "john@example.com");
        Order order = new Order(product, 3, customer);

        order.displayOrderDetails();
    }
}