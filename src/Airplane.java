// 12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.

public class Airplane {
    private int flightNumber;
    private String flightDestination;
    private String departureDate;
    private String flightStatus;

    public Airplane(int flightNumber, String flightDestination, String departureDate) {
        this.flightNumber = flightNumber;
        this.flightDestination = flightDestination;
        this.departureDate = departureDate;
        this.flightStatus = "";
    }

    public void checkFlightStatus() {
        if (this.flightNumber >= 201 && this.flightNumber <= 300) {
            this.flightStatus = "Pending Approval";
        } else if (this.flightNumber >= 101 && this.flightNumber <= 200) {
            this.flightStatus = "Reserved";
        } else if (this.flightNumber <= 100) {
            this.flightStatus = "Available";
        } else {
            this.flightStatus = "Cancelled";
        }
        System.out.println("Flight Status: " + this.flightStatus);
    }

    public void printFlightInfo() {
        System.out.println("Flight Number: " + this.flightNumber + " Flight Status: " + this.flightStatus + " Flight Destination: " + this.flightDestination + " Departure Date: " + this.departureDate);
    }
}
