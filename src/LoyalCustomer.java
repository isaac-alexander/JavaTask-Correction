public class LoyalCustomer extends Customer {
    private int discount;


    public LoyalCustomer(String name, String email, String purchaseHistory, int discount) {
        super(name, email, purchaseHistory);
        this.discount = discount;
    }

//Continue
}
