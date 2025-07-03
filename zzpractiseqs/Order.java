class Order {
    private Product product;
    private int quantityOrdered;
    private Customer customer;

    public Order(Product product, int quantityOrdered, Customer customer) {
        this.product = product;
        this.quantityOrdered = quantityOrdered;
        this.customer = customer;
    }

    public double getOrderTotal() {
        return product.getPrice() * quantityOrdered;
    }

    public void displayOrderDetails() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity Ordered: " + quantityOrdered);
        System.out.println("Order Total: $" + getOrderTotal());
    }
}