package stateDesignPattern.states;

import stateDesignPattern.*;

public class Delivered implements State{
    public void next(Controler controler){
        System.out.println("Package is delivered");
    }
    public void cancle(Controler controler){}
}
