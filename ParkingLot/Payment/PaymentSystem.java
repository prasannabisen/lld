package ParkingLot.Payment;

import ParkingLot.Vehicle.VechicleType;

public interface PaymentSystem {
    public double calculatePayment(int hour, VechicleType vehicleType);
}
