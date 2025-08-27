package TicTacTo.Players;
import java.util.Scanner;

import TicTacTo.Controller;
import TicTacTo.Board.TicTacToBoard;

public class Players2 implements Players{
    private Pices pice = Pices.O;
    public void nextMove(Controller controller, TicTacToBoard Board, Scanner sc){
        Board.printBoard();
        System.out.println("Enter x:-");
        int x = sc.nextInt();
        System.out.println("Enter y:-");
        int y = sc.nextInt();
        Board.setPice(x, y, pice);
        if(Board.isGameOver() == true){
            Board.printBoard();
            System.out.println("Player 2 0 Won");
            controller.setPlayer(new GameOver());
            controller.nextMove(Board, sc);
            return;
        }
        controller.setPlayer(new Players1());
        controller.nextMove(Board, sc);
        return;
    }
}
