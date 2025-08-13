package stateDesignPattern.states;

import stateDesignPattern.Controler;

public class Processing implements State {
    public void next(Controler controler){
        System.out.println("Processing the order");
        controler.setState(new Delivery());
    }
    public void cancle(Controler controler){

    }
}
