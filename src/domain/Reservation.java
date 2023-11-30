package domain;

public class Reservation{
    private String reservationId;
    private String reservationDebutDate;
    private String reservationEndDate;

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
        private String reservationDebutDate;
        private String reservationEndDate;

        public Builder setReservationId(String reservationId) {
            this.reservationId = reservationId;
            return this;
        }

        public Builder setReservationDebutDate(String reservationDebutDate) {
            this.reservationDebutDate = reservationDebutDate;
            return this;
        }

        public Builder setReservationEndDate(String reservationEndDate) {
            this.reservationEndDate = reservationEndDate;
            return this;
        }

        public Reservation build(){
            return new Reservation(this);
        }
    }

    public String getReservationDebutDate() {
        return reservationDebutDate;
    }
    public void setReservationDebutDate(String ReservationDebutDate){
        this.reservationDebutDate = ReservationDebutDate;
    }
    public String getReservationEndDate() {
        return reservationEndDate;
    }
    public void setReservationEndDate(String ReservationEndDate){
        this.reservationEndDate = ReservationEndDate;
    }
}