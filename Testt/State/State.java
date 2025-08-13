package Testt.State;

import java.util.Scanner;

import Testt.Controler;

public interface State {
    Scanner sc = new Scanner(System.in);
    public boolean  next(Controler controler, Scanner sc);
    public void  cancel();
}
