package domain;

public class RentalShop {
    private double rentalShopCA;
    private String rentalShop;
    private String rentalShopAdress;

    RentalShop(String rentalShop, String rentalShopAdress, double rentalShopCA) {
        this.rentalShop = rentalShop;
        this.rentalShopAdress = rentalShopAdress;
        this.rentalShopCA = rentalShopCA;
    }

    public double getRentalShopCA() {
        return rentalShopCA;
    }

    public void setRentalShopCA(double rentalShopCA) {
        this.rentalShopCA = rentalShopCA;
    }

    public String getRentalShop() {
        return rentalShop;
    }

    public void setRentalShop(String rentalShop) {
        this.rentalShop = rentalShop;
    }

    public String getRentalShopAdress() {
        return rentalShopAdress;
    }

    public void setRentalShopAdress(String rentalShopAdress) {
        this.rentalShopAdress = rentalShopAdress;
    }

    // GetListofVehicleAvailable()
}