package Pizza.Topping;

import Pizza.PizzaDecorator;
import Pizza.BasePizza.BasePizza;

public class Extraccheese extends PizzaDecorator {
    public Extraccheese(BasePizza pizza){
        super(pizza);
    }
    public int getPrice() {
        return pizza.getPrice() + 30;
    }
}
