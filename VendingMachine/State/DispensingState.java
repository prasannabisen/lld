package VendingMachine.State;

import java.util.Scanner;

import VendingMachine.Controller;
import VendingMachine.Items.ItemOperation;

public class DispensingState implements State {
    private int coin;

    public DispensingState(int coin) {
        this.coin = coin;
    }

    public void next(Controller controller, ItemOperation itemOp, Scanner sc) {
        System.out.println("Dispensing required item");
        System.out.print("Enter S.No of the item:- ");
        int sNo = sc.nextInt();
        if (coin >= itemOp.getPrice(sNo) && itemOp.dispers(sNo)) {
            controller.setState(new DispersedState());
            return;
        }
        controller.setState(new OutOfStockState());
    }

    public void cancle() {

    }
}
