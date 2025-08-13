package stateDesignPattern.states;

import stateDesignPattern.Controler;

public class Delivery implements State{
    public void next(Controler controler){
        System.out.println("Delivery the order");
        controler.setState(new Delivered());
    }
    public void cancle(Controler controler){}
}
