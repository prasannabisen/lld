package Factory;

import Factory.Ways.WayInterface;

public class Main {
    public static void main(String[] args) {
        WayInterface way = new Factory().selectWays("road");
        way.send();
    }
}
