// 22. Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history. Implement methods to add purchases to the history and calculate total expenditure. Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.


public class Customer {
    private String name;
    private String email;
    private String purchaseHistory;

    public Customer(String name, String email, String purchaseHistory) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = purchaseHistory;
    }

    public void purchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public void totalExpenditure(String totalExpenditure) {

    }
}
