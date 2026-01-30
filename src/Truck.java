public class Truck extends Vehicle {
    private String payloadCapacity;

    public Truck(String make, String model, String year, String payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Details: "+ this.make  + this.model  + this.year + this.payloadCapacity);
    }
}