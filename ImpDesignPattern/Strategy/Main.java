package ImpDesignPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        StrategyImplemantation strategy1 = new StrategyImplemantation(new AirportStrategy());
        StrategyImplemantation strategy2 = new StrategyImplemantation(new NormalStrategy());

        strategy1.matchService();
        strategy2.matchService();
        strategy2.setStrategy(new AirportStrategy());
        strategy2.matchService();
    }
}
