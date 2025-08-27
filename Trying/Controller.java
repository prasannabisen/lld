package Trying;

import Trying.Theater.TheaterOp;

public class Controller {
    ControlInterface interfaces;
    public Controller(){
        this.interfaces = new TheaterOp(); 
    }

    public void setNext(ControlInterface interfaces){
        this.interfaces = interfaces;
    }

    public void next(){
        interfaces.next(this);
    }
}
