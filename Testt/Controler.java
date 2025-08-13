package Testt;

import java.util.Scanner;

import Testt.State.InitialState;
import Testt.State.State;

public class Controler {
    private State state;
    Scanner sc = new Scanner(System.in);;

    Controler() {
        this.state = new InitialState();
    }

    public void setState(State state){
        this.state = state;
    }

    public boolean next(){
        return state.next(this, sc);
    }
}
