package factory;
import domain.Reservation;

import java.util.Date;

public class ReservationFactory {
    public static Reservation getReservation(String reservationId, Date reservationDebutDate, Date reservationEndDate){
        return new Reservation.Builder()
            .setReservationId(reservationId)
            .setReservationDebutDate(reservationDebutDate)
            .setReservationEndDate(reservationEndDate)
            .build();
    }
}
