package DiscountCoupoun.Strategy;

public class DiscountStrategy {
    DiscoumtInterface discountStrategy;

    public DiscountStrategy(DiscoumtInterface discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double totalDiscount(double price) {
        return discountStrategy.calculateDiscount(price);
    }

    public void setDiscountStrategy(DiscoumtInterface discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
