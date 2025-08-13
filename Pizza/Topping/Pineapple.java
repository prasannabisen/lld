package Pizza.Topping;

import Pizza.PizzaDecorator;
import Pizza.BasePizza.BasePizza;

public class Pineapple extends PizzaDecorator {
    public Pineapple(BasePizza pizza){
        super(pizza);
    }
    public int getPrice() {
        return pizza.getPrice()+40;
    }
    
}
