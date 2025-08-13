package ParkingLot.Vehicle;

import ParkingLot.Payment.PaymentSystem;

public class Bike extends Vechicle{
    public Bike(String licencePlate, PaymentSystem paymentSystem){
        super(licencePlate, VechicleType.BIKE, paymentSystem);
    }
}
