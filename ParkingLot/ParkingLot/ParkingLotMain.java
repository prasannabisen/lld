package ParkingLot.ParkingLot;

import java.util.ArrayList;
import java.util.List;

import ParkingLot.Payment.Hourly;
import ParkingLot.Payment.PaymentSystem;
import ParkingLot.Vehicle.Vechicle;
import ParkingLot.Vehicle.VechicleFactory;
import ParkingLot.Vehicle.VechicleType;

public class ParkingLotMain {
    public static void main(String[] args) {
        List<ParkingSpot> parkingLots = new ArrayList<>();
        parkingLots.add(new CarParkingSpot(1));

        ParkingLot parkingLot = new ParkingLot(parkingLots);
        PaymentSystem hourPaymentSystem = new Hourly();



        Vechicle v1 = VechicleFactory.creatVechicle(VechicleType.CAR, "CAR123", hourPaymentSystem);
        System.out.println(v1.calculatePayment(3, VechicleType.BIKE));
    }
}
