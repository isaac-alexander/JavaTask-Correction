// 28. Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date. Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number for hotels and seat number for flights. Implement methods to check reservation status and modify reservation details.

import java.time.LocalDate;

public class Reservation {
    protected int reservationId;
    protected String customerName;
    protected LocalDate date;
    protected String status; //pending, confirmed, cancelled

    public Reservation(int reservationId, String customerName, LocalDate date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
        this.status = "pending";
    }

    public String checkReservationStatus() {
        return "Reservation Id: " + this.reservationId + " Status: " + this.status;
    }

    public void modifyReservationDetails(String status, LocalDate date) {
        this.status = status;
        this.date = date;
        System.out.println("Status Updated");
    }


}