package factory;
import domain.Reservation;

public class ReservationFactory {
    public static Reservation getReservation(String reservationId, String reservationDebutDate, String reservationEndDate){
        return new Reservation.Builder()
            .setReservationId(reservationId)
            .setReservationDebutDate(reservationDebutDate)
            .setReservationEndDate(reservationEndDate)
            .build();
    }
}
