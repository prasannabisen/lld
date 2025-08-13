package stateDesignPattern.states;

import stateDesignPattern.Controler;

public interface State {
    public void next(Controler controler);
    public void cancle(Controler controler);
}
