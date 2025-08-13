package stateChangePattern.State;

import stateChangePattern.Controler;

public interface State {
    public void next(Controler controler);
    public void cancle();
}
