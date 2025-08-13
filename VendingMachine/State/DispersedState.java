package VendingMachine.State;

import java.util.Scanner;

import VendingMachine.Controller;
import VendingMachine.Items.ItemOperation;

public class DispersedState implements State {

    public void next(Controller controller, ItemOperation itemOp, Scanner sc) {
        System.out.println("Thanks for Shoping with us");
    }

    public void cancle() {

    }
}
