package Trying.Screen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Screen {
    int noScreen;
    List<String> filmName = new ArrayList<>();
    Map<String, String> filmTiming = new HashMap<>();

    public Screen(int noScreen, List<String> filmName, Map<String, String> filmTiming) {
        this.noScreen = noScreen;
        this.filmName = filmName;
        this.filmTiming = filmTiming;
    }
}
