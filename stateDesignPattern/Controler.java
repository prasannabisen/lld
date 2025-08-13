package stateDesignPattern;

import stateDesignPattern.states.AcceptState;
import stateDesignPattern.states.State;

public class Controler {
    private State state;
    Controler(){
        this.state = new AcceptState();
    }

    public void next(){
        state.next(this);
    }    

    public void setState(State state){
        this.state= state;
    }
    
}
