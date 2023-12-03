package domain;

import java.util.ArrayList;
import java.util.List;

public class Vehicle{
    private String VehicleName;
    private String VehicleBrand;
    private String VehicleImmatriculation;
    private int VehicleYearCreation;
    private double VehicleKMCounter;
    private List<Reservation> reservation;

    private Vehicle(Builder builder) {
        this.VehicleName = builder.VehicleName;
        this.VehicleBrand = builder.VehicleBrand;
        this.VehicleImmatriculation = builder.VehicleImmatriculation;
        this.VehicleYearCreation = builder.VehicleYearCreation;
        this.VehicleKMCounter = builder.VehicleKMCounter;
        this.reservation = builder.reservation;
    }

    @Override
    public String toString() {
        if(this.reservation != null) {
            return "domain.Vehicle{" +
                    "VehicleName='" + VehicleName + '\'' +
                    ", VehicleBrand='" + VehicleBrand + '\'' +
                    ", VehicleImmatriculation=" + VehicleImmatriculation +
                    ", VehicleYearCreation=" + VehicleYearCreation +
                    ", VehicleKMCounter=" + VehicleKMCounter +
                    ", reservation=" + reservation +
                    '}';
        }
        else {
            return "domain.Vehicle{" +
                    "VehicleName='" + VehicleName + '\'' +
                    ", VehicleBrand='" + VehicleBrand + '\'' +
                    ", VehicleImmatriculation=" + VehicleImmatriculation +
                    ", VehicleYearCreation=" + VehicleYearCreation +
                    ", VehicleKMCounter=" + VehicleKMCounter +
                    '}';
        }
    }

    public static class Builder{
        private String VehicleName;
        private String VehicleBrand;
        private String VehicleImmatriculation;
        private int VehicleYearCreation;
        private double VehicleKMCounter;
        private List<Reservation> reservation = new ArrayList<>();
        public Builder setVehicleName(String VehicleName) {
            this.VehicleName = VehicleName;
            return this;
        }
        public Builder setReservation(List<Reservation> reservation) {
            this.reservation = reservation;
            return this;
        }

        public Builder setVehicleBrand(String VehicleBrand) {
            this.VehicleBrand = VehicleBrand;
            return this;
        }

        public Builder setVehicleImmatriculation(String VehicleImmatriculation) {
            this.VehicleImmatriculation = VehicleImmatriculation;
            return this;
        }

        public Builder setVehicleYearCreation(int VehicleYearCreation) {
            this.VehicleYearCreation = VehicleYearCreation;
            return this;
        }

        public Builder setVehicleKMCounter(Double VehicleKMCounter) {
            this.VehicleKMCounter = VehicleKMCounter;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }

    public String getVehicleName() {
        return VehicleName;
    }
    public String getVehicleBrand() {
        return VehicleBrand;
    }
    public String getVehicleImmatriculation() {
        return VehicleImmatriculation;
    }
    public int getVehicleYearCreation() {
        return VehicleYearCreation;
    }
    public double getVehicleKMCounter() {
        return VehicleKMCounter;
    }
    public List<Reservation> getReservation() {
        return reservation;
    }
    public void setReservation(List<Reservation> reservation){
        this.reservation = reservation;
    }
    public void addReservation(Reservation reservation){
        this.reservation.add(reservation);
    }
    public void setVehicleKMCounter(double VehicleKMCounter){
        this.VehicleKMCounter = VehicleKMCounter;
    }
    

}
