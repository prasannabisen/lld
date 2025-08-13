package ParkingLot.Vehicle;

import ParkingLot.Payment.PaymentSystem;

public abstract class Vechicle {
    private String licencePlate;
    private VechicleType vechicleType;
    private PaymentSystem paymentSystem;

    public Vechicle(String licencePlate, VechicleType vechicleType, PaymentSystem paymentSystem){
        this.licencePlate = licencePlate;
        this.vechicleType = vechicleType;
        this.paymentSystem = paymentSystem;
    }

    public VechicleType getVechicleType(){
        return vechicleType;
    }

    public String getLicencePlate(){
        return licencePlate;
    }

    public PaymentSystem getPaymentSystem(){
        return paymentSystem;
    }

    public double calculatePayment(int duration, VechicleType vechicleType){
        return paymentSystem.calculatePayment(duration, vechicleType);
    }
}
