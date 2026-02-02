// 27. Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date. Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. Implement methods to calculate delivery time based on the address and update the tracking status.


public class CustomerOrder {
    private int orderID;
    private String customer;
    private String orderDate;

    public CustomerOrder(int orderID, String customer, String orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
    }

}
