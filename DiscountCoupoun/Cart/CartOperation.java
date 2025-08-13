package DiscountCoupoun.Cart;

import java.util.ArrayList;
import java.util.List;;

public class CartOperation {
    List<Cart> carts = new ArrayList<>();

    public CartOperation(List<Cart> carts) {
        this.carts = carts;
    }

    public double totalAmonut() {
        double totalPrice = 0;
        for (Cart it : this.carts) {
            totalPrice += it.price;
        }
        return totalPrice;
    }

    public void showItem() {
        for (Cart cart : this.carts) {
            System.out.println(cart.name);
        }
    }
}
