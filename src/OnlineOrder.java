public class OnlineOrder extends CustomerOrder{
    private String deliveryAddress;
    private int trackingNo;
    private String trackingStatus;


    public OnlineOrder(int orderID, String customer, String orderDate,  String deliveryAddress, int trackingNo) {
        super(orderID, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNo = trackingNo;
        this.trackingStatus = "";
    }

    public String calculateDeliveryTime() {
        if (deliveryAddress.equalsIgnoreCase("lagos")) {
            return "2 days"; // days
        } else {
            return "7 days"; // days
        }
    }


    public String updateTrackingStatus() {
        if (deliveryAddress.equalsIgnoreCase("lagos")) {
            return this.trackingStatus = "On route";
        } else {
            return this.trackingStatus =  "Pending";
        }
    }


    public void displayDetails() {
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNo);
        System.out.println("Tracking Status: " + trackingStatus);
        System.out.println("Estimated Delivery Time: " + calculateDeliveryTime());
    }
}
