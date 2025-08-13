package VendingMachine.State;

import java.util.Scanner;

import VendingMachine.Controller;
import VendingMachine.Items.ItemOperation;

public class OutOfStockState implements State {
    public void next(Controller controller, ItemOperation itemOp, Scanner sc) {
        System.out.println("Item is out of stock");
        System.out.println("Thanks for shoping");
    }

    public void cancle() {

    }
}