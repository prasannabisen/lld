package VendingMachine.State;

import java.util.Scanner;

import VendingMachine.Controller;
import VendingMachine.Items.ItemOperation;;

public class NoCoinState implements State {
    public void next(Controller controller, ItemOperation itemOp, Scanner sc) {
        System.out.println("No coin state");
        controller.setState(new HasCoinState());
    }

    public void cancle() {

    }
}
