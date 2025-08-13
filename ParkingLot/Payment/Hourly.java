package ParkingLot.Payment;

import ParkingLot.Vehicle.VechicleType;

public class Hourly implements PaymentSystem{
    public double calculatePayment(int hour, VechicleType vehicleType){
        if(vehicleType == VechicleType.BIKE){
            return hour*5;
        }
        if(vehicleType == VechicleType.CAR){
            return hour*10;
        }
        return hour*20;
    }
}
