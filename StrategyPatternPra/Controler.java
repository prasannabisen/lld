package StrategyPatternPra;

import StrategyPatternPra.Strategy.Strategy;;;

public class Controler {
    private Strategy strategy;
    public Controler(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void match(){
        this.strategy.match();
    }
}
