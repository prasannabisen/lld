package StrategyPatternPra;

import StrategyPatternPra.Strategy.InternationalMatch;
import StrategyPatternPra.Strategy.NearMatch;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler(new InternationalMatch());
        controler.match();
        controler.setStrategy(new NearMatch());
        controler.match();
    }
}
