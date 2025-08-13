package VendingMachine.State;

import java.util.Scanner;

import VendingMachine.Controller;
import VendingMachine.Items.ItemOperation;

public class HasCoinState implements State {
    public void next(Controller controller, ItemOperation itemOp, Scanner sc) {
        System.out.print("Please Insert the coin:-");
        int coin = sc.nextInt();
        System.out.println("Coin Insertrd " + coin);
        controller.setState(new DispensingState(coin));
    }

    public void cancle() {

    }
}
