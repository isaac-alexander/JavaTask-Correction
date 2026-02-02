import java.time.LocalDate;

public class RailwayReservation extends Reservation {
    private int flightSeatNo;

    public RailwayReservation(int flightSeatNo, int reservationId, String customerName, LocalDate date) {
        super(reservationId, customerName, date);
        this.flightSeatNo = flightSeatNo;
    }

    public void modifyReservationDetails(String status, LocalDate date, int flightSeatNo) {
        this.flightSeatNo = flightSeatNo;
        super.modifyReservationDetails(status, date);
    }

    @Override
    public String checkReservationStatus() {
        return "flightSeatNo " + this.flightSeatNo + " " + super.checkReservationStatus() ;
    }
}
