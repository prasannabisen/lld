package VendingMachine.Items;

import java.util.ArrayList;
import java.util.List;

public class ItemOperation {
    private List<Item> item = new ArrayList<>();

    public void addItem(String name, int quantity, int price) {
        item.add(new Item(name, quantity, price));
    }

    public int getPrice(int sNo){
        return item.get(sNo).price;
    }
    public boolean dispers(int sNo){
        Item currItem = item.get(sNo);
        if(currItem.quantity<1){
            return false;
        }
        currItem.quantity -=1;
        item.set(sNo, currItem); 
        return true;
    }

    public void printAllItem() {
        System.out.println("SNo. Name      Price   quantity");
        for (int i=0; i<item.size(); i++) {
            System.out.println(i+"   "+ item.get(i).itemName + ":- " + item.get(i).price + "   " + item.get(i).quantity);
        }
    }
}
