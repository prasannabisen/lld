package ParkingLot.Payment;

import ParkingLot.Vehicle.VechicleType;

public class Premium implements PaymentSystem{
    public double calculatePayment(int hour, VechicleType vehicleType){
        if(vehicleType == VechicleType.BIKE){
            return hour*15;
        }
        if(vehicleType == VechicleType.CAR){
            return hour*110;
        }
        return 100*hour;
    }
}
