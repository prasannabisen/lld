package VendingMachine.Items;

public class Item {
    String itemName;
    int quantity;
    int price;

    public Item(String itemName, int quantity, int price){
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
}
