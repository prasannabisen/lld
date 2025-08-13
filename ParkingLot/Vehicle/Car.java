package ParkingLot.Vehicle;

import ParkingLot.Payment.PaymentSystem;

public class Car extends Vechicle {    
    public Car(String licencePlate, PaymentSystem paymentSystem){
        super(licencePlate, VechicleType.CAR, paymentSystem);
    }
}
