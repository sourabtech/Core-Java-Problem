package LabProgram;
import java.util.ArrayList;
import java.util.List;

interface Product {
    void showProduct();
    void addProduct(Product product);
    void deleteProduct(Product product);
    double calculateProductPrice();
}

class OnlineProduct implements Product {
    private String name;
    private double price;

    public OnlineProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showProduct() {
        System.out.println("Online Product: " + name + ", Price: $" + price);
    }

    @Override
    public void addProduct(Product product) {
        // This method is not applicable for OnlineProduct
        System.out.println("Cannot add products to OnlineProduct");
    }

    @Override
    public void deleteProduct(Product product) {
        // This method is not applicable for OnlineProduct
        System.out.println("Cannot delete products from OnlineProduct");
    }

    @Override
    public double calculateProductPrice() {
        return price;
    }
}

class PhysicalProduct implements Product {
    private String name;
    private double price;

    public PhysicalProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showProduct() {
        System.out.println("Physical Product: " + name + ", Price: $" + price);
    }

    @Override
    public void addProduct(Product product) {
        // This method is not applicable for PhysicalProduct
        System.out.println("Cannot add products to PhysicalProduct");
    }

    @Override
    public void deleteProduct(Product product) {
        // This method is not applicable for PhysicalProduct
        System.out.println("Cannot delete products from PhysicalProduct");
    }

    @Override
    public double calculateProductPrice() {
        return price;
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(List<Product> products) {
        double totalPrice = 0;
        for (Product product : products) {
            product.showProduct();
            totalPrice += product.calculateProductPrice();
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        // Creating products
        Product onlineProduct = new OnlineProduct("Java Programming Book", 30.0);
        Product physicalProduct = new PhysicalProduct("Laptop", 1000.0);

        // Creating customer
        Customer customer = new Customer("John");

        // Adding products to order
        List<Product> products = new ArrayList<>();
        products.add(onlineProduct);
        products.add(physicalProduct);

        // Placing order
        customer.placeOrder(products);
    }
}

