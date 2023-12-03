package domain;

import java.util.Date;

public class Reservation{
    private String reservationId;
    private Date reservationDebutDate;
    private Date reservationEndDate;

    private Reservation(Builder builder) {
        this.reservationId = builder.reservationId;
        this.reservationDebutDate = builder.reservationDebutDate;
        this.reservationEndDate = builder.reservationEndDate;
    }

    @Override
    public String toString() {
        return "domain.Reservation{" +
                "reservationId='" + reservationId + '\'' +
                ", reservationDebutDate='" + reservationDebutDate + '\'' +
                ", reservationEndDate=" + reservationEndDate +
                '}';
    }

    public static class Builder{
        private String reservationId;
        private Date reservationDebutDate;
        private Date reservationEndDate;

        public Builder setReservationId(String reservationId) {
            this.reservationId = reservationId;
            return this;
        }

        public Builder setReservationDebutDate(Date reservationDebutDate) {
            this.reservationDebutDate = reservationDebutDate;
            return this;
        }

        public Builder setReservationEndDate(Date reservationEndDate) {
            this.reservationEndDate = reservationEndDate;
            return this;
        }

        public Reservation build(){
            return new Reservation(this);
        }
    }

    public Date getReservationDebutDate() {
        return reservationDebutDate;
    }
    public void setReservationDebutDate(Date ReservationDebutDate){
        this.reservationDebutDate = ReservationDebutDate;
    }
    public Date getReservationEndDate() {
        return reservationEndDate;
    }
    public void setReservationEndDate(Date ReservationEndDate){
        this.reservationEndDate = ReservationEndDate;
    }
}