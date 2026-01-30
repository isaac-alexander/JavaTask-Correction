public class Car extends Vehicle {
    private String trunkSize;

    public Car(String make, String model, String year, String trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Details: "+ this.make  + this.model  + this.year + trunkSize);
    }
}