package ParkingLot.ParkingLot;

import ParkingLot.Vehicle.Vechicle;
import ParkingLot.Vehicle.VechicleType;

public class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(int spotNumber){
        super(spotNumber, "Car");
    }

    public boolean canParkVerchicle(Vechicle vechicle){
        return VechicleType.CAR == vechicle.getVechicleType();
    }
}
