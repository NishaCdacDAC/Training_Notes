// Product class to represent individual products
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

// ShoppingCart class to manage products
class ShoppingCart {
    private static final int MAX_PRODUCTS = 100; // Maximum number of products in the cart
    private Product[] products;
    private int productCount;

    public ShoppingCart() {
        this.products = new Product[MAX_PRODUCTS];
        this.productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < MAX_PRODUCTS) {
            products[productCount++] = product;
        } else {
            System.out.println("The cart is full. Cannot add more products.");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < productCount; i++) {
            totalCost += products[i].getTotalCost();
        }
        return totalCost;
    }

    public void displayCartContents() {
        if (productCount == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart contents:");
            for (int i = 0; i < productCount; i++) {
                System.out.println(products[i]);
            }
        }
    }
}

public class MainProduct {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addProduct(new Product("Laptop", 999.99, 2));
        cart.addProduct(new Product("Smartphone", 499.99, 3));
        cart.addProduct(new Product("Tablet", 299.99, 1));

        // Displaying cart contents
        cart.displayCartContents();

        // Calculating total cost
        double totalCost = cart.calculateTotalCost();
        System.out.println("Total cost: Rs." + totalCost);
    }
}
