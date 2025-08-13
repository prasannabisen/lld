package DiscountCoupoun;

import java.util.ArrayList;
import java.util.List;
import DiscountCoupoun.Cart.*;
import DiscountCoupoun.Strategy.DiscountStrategy;
import DiscountCoupoun.Strategy.PercentageDiscount;
import DiscountCoupoun.Strategy.ThresoldDiscount;;

public class Main {
    public static void main(String[] args) {
        List<Cart> carts = new ArrayList<>();
        carts.add(new Cart("popcorn", 12));
        carts.add(new Cart("chips", 10));
        carts.add(new Cart("choclate", 15));
        carts.add(new Cart("mobile",50000));

        DiscountStrategy strategy = new DiscountStrategy(new PercentageDiscount(.5));

        CartOperation cartOperation = new CartOperation(carts);
        cartOperation.showItem();
        System.out.println(cartOperation.totalAmonut());
        System.out.println(strategy.totalDiscount(cartOperation.totalAmonut()));
        
        strategy.setDiscountStrategy(new ThresoldDiscount(10, 15));
        System.out.println(cartOperation.totalAmonut());
        System.out.println(strategy.totalDiscount(cartOperation.totalAmonut()));
    }   
}
