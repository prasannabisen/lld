package stateChangePattern;

import stateChangePattern.State.ProcessingState;
import stateChangePattern.State.State;

public class Controler {
    private State state;
    Controler(){
        this.state = new ProcessingState();
    }

    public void stateChange(State state){
        this.state = state;
    }

    public void next(){
        this.state.next(this);
    }
}
