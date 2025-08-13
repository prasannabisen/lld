package stateChangePattern.State;

import stateChangePattern.*;;

public class ProcessingState implements State{
    public void next(Controler controler){
        System.out.println("processing");
        controler.stateChange(new Processed());
    }
    public void cancle(){

    } 
}
