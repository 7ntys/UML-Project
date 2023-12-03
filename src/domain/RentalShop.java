package domain;

public class RentalShop {
    private double rentalShopCA;
    private String rentalShop;
    private String rentalShopAdress;

    RentalShop(Builder builder) {
        this.rentalShop = builder.rentalShop;
        this.rentalShopAdress = builder.rentalShopAdress;
        this.rentalShopCA = builder.rentalShopCA;
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

    public String getRentalShopAdress() {
        return rentalShopAdress;
    }

    public void setRentalShopAdress(String rentalShopAdress) {
        this.rentalShopAdress = rentalShopAdress;
    }

    public static class Builder {
        private double rentalShopCA;
        private String rentalShop;
        private String rentalShopAdress;

        public Builder setRentalShopCA(double rentalShopCA) {
            this.rentalShopCA = rentalShopCA;
            return this;
        }

        public Builder setRentalShop(String rentalShop) {
            this.rentalShop = rentalShop;
            return this;
        }

        public Builder setRentalShopAdress(String rentalShopAdress) {
            this.rentalShopAdress = rentalShopAdress;
            return this;
        }

        public RentalShop build() {
            return new RentalShop(this);
        }
    }
}
