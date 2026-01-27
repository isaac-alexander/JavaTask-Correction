// 13. Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<String> products;

    public  Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String product) {
        this.products.add(product);
    }

    public void removeProduct(String product) {
        this.products.remove(product);
    }

    public void checkInventory() {
        for(String product : this.products) {
            if (this.products.size() <= 2) {
                System.out.println("Available product : " + product + " restock");
            } else if (this.products.size() > 3) {
                System.out.println("Available product : " + product + " check sales");
            }
        }
        System.out.println(this.products.size() + " products in inventory");
    }
}
