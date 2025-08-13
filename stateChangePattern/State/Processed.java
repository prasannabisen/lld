package stateChangePattern.State;

import stateChangePattern.Controler;

public class Processed implements State{
    public void next(Controler controler){
        System.out.println("Processed");
    }
    public void cancle(){

    }
}
