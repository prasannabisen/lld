package Pizza;

import Pizza.BasePizza.BasePizza;

public abstract class PizzaDecorator implements BasePizza{
    protected BasePizza pizza;
    public PizzaDecorator(BasePizza pizza){
        this.pizza = pizza;
    }
}
