package DiscountCoupoun.Strategy;

public class ThresoldDiscount implements DiscoumtInterface {
    private double flatDiscount;
    private double thresholdPrice = 1000;

    public ThresoldDiscount(double flatDiscount, double thresholdPrice) {
        this.flatDiscount = flatDiscount;
        this.thresholdPrice = thresholdPrice;
    }

    public double calculateDiscount(double totalPrice) {
        if (totalPrice > thresholdPrice) {
            return totalPrice - flatDiscount;
        }
        System.out.println("No discount");
        return totalPrice;
    }

}
