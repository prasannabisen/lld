package VendingMachine;

import java.util.Scanner;

import VendingMachine.Items.ItemOperation;
import VendingMachine.State.NoCoinState;
import VendingMachine.State.State;

public class Controller {
    private State state;
    ItemOperation itemOp;
    Scanner sc = new Scanner(System.in);

    Controller(ItemOperation itemOp) {
        this.itemOp = itemOp;
        this.state = new NoCoinState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void next() {
        this.state.next(this, itemOp, sc);
    }
}
