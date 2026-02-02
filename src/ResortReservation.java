
import java.time.LocalDate;

public class ResortReservation extends Reservation {
    private int hotelRoomNo;

    public ResortReservation(int hotelRoomNo, int reservationId, String customerName, LocalDate date) {
        super(reservationId, customerName, date);
        this.hotelRoomNo = hotelRoomNo;
    }


    public void modifyReservationDetails(int hotelRoomNo, String status, LocalDate date) {
        this.hotelRoomNo = hotelRoomNo;
        super.modifyReservationDetails(status, date);
    }

    @Override
    public String checkReservationStatus() {
        return "hotelRoomNo: " + this.hotelRoomNo + " " + super.checkReservationStatus() ;
    }
}
