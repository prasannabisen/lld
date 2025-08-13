package Testt.State;

import java.util.Scanner;

import Testt.Controler;

public class InitialState implements State {
    public boolean next(Controler controler, Scanner sc) {
        System.out.println("Initial State");
        controler.setState(new FinalState());
        return true;
    }

    public void cancel() {

    }
}
