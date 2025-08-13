package ImpDesignPattern.Strategy;

public class StrategyImplemantation {
    private Strategy strategy;
    public StrategyImplemantation(Strategy strategy){
        this.strategy = strategy;
    }

    void matchService(){
        strategy.implement();
    }

    void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}
