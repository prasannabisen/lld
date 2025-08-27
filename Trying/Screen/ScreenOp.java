package Trying.Screen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Trying.ControlInterface;
import Trying.Controller;

public class ScreenOp implements ControlInterface {
    private List<Screen> screenDetails = new ArrayList<>();

    public void add(int noScreen, List<String> filmName, Map<String, String> filmTiming) {
        screenDetails.add(new Screen(noScreen, filmName, filmTiming));
    }

    public void next(Controller controller) {
        System.out.println("aaaaaa00");
    }

    public void cancel() {

    }

}
