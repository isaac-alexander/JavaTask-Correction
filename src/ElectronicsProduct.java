// 24. Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price. Implement methods to apply a discount and calculate the final price. Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.

public class ElectronicsProduct {
    private final int productID;
    private final String name;
    private double price;

    public ElectronicsProduct(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void getDiscount() {
        double discount = 0.2 * this.price;
        this.price -= discount;
    }

    public double calculateFinalPrice() {
        return this.price;
    }

    public void printProductDetails() {
        System.out.println( "productId: " + this.productID + " name: " + this.name + " price: " + this.price);
    }
}