package Testt.State;

import java.util.Scanner;

import Testt.Controler;

public class FinalState implements State {
    public boolean next(Controler controler, Scanner sc) {
        System.out.println("You are in the Final State");
        int choice = sc.nextInt();
        if (choice == 1) {
            controler.setState(new InitialState());
            return true;
        }
        return false;
    }
    public void  cancel(){

    }
}
