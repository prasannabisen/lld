package ParkingLot.Vehicle;

import ParkingLot.Payment.PaymentSystem;

public class VechicleFactory {
    public static Vechicle creatVechicle(VechicleType vechicleType, String licencePlate, PaymentSystem paymentSystem){
        if(vechicleType == VechicleType.BIKE){
            return new Bike(licencePlate, paymentSystem);
        }
        return new Car(licencePlate, paymentSystem);
    }
}
