package VendingMachine;

import VendingMachine.Items.ItemOperation;

public class Main {
    public static void main(String[] args) {
        ItemOperation itemOp = new ItemOperation();
        itemOp.addItem("Coke", 10, 20);
        itemOp.addItem("Chips", 10, 10);
        itemOp.addItem("Silk", 10, 50);
        itemOp.addItem("Nachos", 10, 30);
        itemOp.addItem("Water", 10, 10);

        itemOp.printAllItem();

        Controller controller = new Controller(itemOp);
        controller.next();
        controller.next();
        controller.next();
        controller.next();
        itemOp.printAllItem();
    }
}
