package ParkingLot.ParkingLot;

import java.util.List;

import ParkingLot.Vehicle.Vechicle;

public class ParkingLot {
    List<ParkingSpot> parkingSpot;

    public ParkingLot(List<ParkingSpot> parkingSpots){
        this.parkingSpot = parkingSpots;
    }

    public ParkingSpot findAvaliableSpot(Vechicle vechicle){
        for(ParkingSpot spot: parkingSpot){
            if(spot.isOccupied() && spot.canParkVerchicle(vechicle)){
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVechicle(Vechicle vechicle){
        ParkingSpot spot = findAvaliableSpot(vechicle);
        if(spot!=null){
            spot.parkVehicle(vechicle);
            System.out.println("Parked Vechicle"+vechicle);
            return spot;
        }
        System.out.println("No Parking");
        return null;
    }

    public void vacetSpot(ParkingSpot spot, Vechicle vechicle){
        spot.vacent();
    }
}
