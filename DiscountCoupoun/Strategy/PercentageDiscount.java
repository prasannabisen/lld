package DiscountCoupoun.Strategy;

public class PercentageDiscount implements DiscoumtInterface {
    private double discountPercentage;

    public PercentageDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double calculateDiscount(double totalPrice) {
        return totalPrice - (totalPrice * discountPercentage);
    }
}
