package Trying.Theater;

import java.util.ArrayList;
import java.util.List;
import Trying.Controller;
import Trying.Screen.ScreenOp;
import Trying.ControlInterface;

public class TheaterOp implements ControlInterface{
    private List<Theater> theaterList = new ArrayList<>();
    public void addTheater(String theaterName, int noScreen, String location){
        theaterList.add(new Theater(theaterName, noScreen, location));
    }

    public void printTheater(){
        for(Theater it:theaterList){
            System.out.println("Theater Name:- "+it.theaterName);
            System.out.println("Theater Screen:- "+it.noScreen);
            System.out.println("Theater location- "+it.location);
        }
    }

    public void next(Controller control){
        printTheater();
        control.setNext(new ScreenOp());
    }
    public void cancel(){

    }
}
