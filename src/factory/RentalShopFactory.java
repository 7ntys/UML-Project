package factory;

import domain.RentalShop;

public class RentalShopFactory {
    public static RentalShop getRentalShop(double rentalShopCA, String rentalShop, String rentalShopAdress) {
        return new RentalShop.Builder()
                .setRentalShopCA(rentalShopCA)
                .setRentalShop(rentalShop)
                .setRentalShopAdress(rentalShopAdress)

                .build();
    }
}
