package VendingMachine.State;

import java.util.Scanner;

import VendingMachine.Controller;
import VendingMachine.Items.ItemOperation;

public interface State {
    public void next(Controller controller, ItemOperation itemOp, Scanner sc);

    public void cancle();
}
