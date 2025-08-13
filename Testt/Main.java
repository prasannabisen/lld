package Testt;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        while(controler.next()) {
            System.out.println("Transitioning to the next state...");
        }
    }
}
