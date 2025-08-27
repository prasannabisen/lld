package Trying;

import Trying.Theater.TheaterOp;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        TheaterOp theaterOp = new TheaterOp();
        theaterOp.addTheater("Metro cinema", 4, "kanker");
        controller.next();
        controller.next();
    }
}
