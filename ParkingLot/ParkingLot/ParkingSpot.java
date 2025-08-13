package ParkingLot.ParkingLot;

import ParkingLot.Vehicle.Vechicle;

public abstract class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vechicle vechicle;
    private String spotType;

    ParkingSpot(int spotNumber, String spotType) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.spotType = spotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public abstract boolean canParkVerchicle(Vechicle vechicle);

    public void parkVehicle(Vechicle vehicle) {
        if (isOccupied) {
            System.out.println("Occupied");
            return;
        }
        if (canParkVerchicle(vehicle)) {
            System.out.println("You cant Park here");
            return;
        }
        this.vechicle = vehicle;
        isOccupied = true;
        return;
    }

    public void vacent() {
        if (!isOccupied) {
            System.out.println("Already vacent");
            return;
        }
        this.vechicle = null;
        this.isOccupied = false;
    }
}
