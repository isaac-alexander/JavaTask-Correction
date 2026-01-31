public class WashingMachine extends ElectronicsProduct {
    private int warranty;

    public WashingMachine (int productID, String name, double price, int warranty) {
        super(productID, name, price);
        this.warranty = warranty;
    }

    public int extendWarranty() {
        int extendWarranty = 1;
        this.warranty += extendWarranty;
        return this.warranty;
    }


    public void printProductDetails() {
        System.out.println("ProductId: " + getProductID() + " name " + getName() + " price " + getPrice() + " warranty: " + this.warranty);
    }
}