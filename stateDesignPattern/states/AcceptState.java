package stateDesignPattern.states;

import stateDesignPattern.Controler;

public class AcceptState implements State{
    public void next(Controler controler){
        System.out.println("Accept the order");
        controler.setState(new Processing());
    }
    public void cancle(Controler controler){

    }
}
