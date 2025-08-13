package Pizza;

import Pizza.BasePizza.BasePizza;
import Pizza.BasePizza.Margrita;
import Pizza.Topping.Extraccheese;
import Pizza.Topping.Pineapple;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Margrita();
        pizza = new Extraccheese(pizza);
        pizza = new Pineapple(pizza);

        System.out.println(pizza.getPrice());
    }
}
