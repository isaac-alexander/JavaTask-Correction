public class LoyalCustomer extends Customer {
    private double discount;


    public LoyalCustomer(String name, String email, double discount) {
        super(name, email);
        this.discount = discount;
    }

    public double getDiscountedTotal() {
        double total = totalExpenditure();
        return total - (total * this.discount);
    }
}
