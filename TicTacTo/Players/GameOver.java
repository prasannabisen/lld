package TicTacTo.Players;

import java.util.Scanner;

import TicTacTo.Controller;
import TicTacTo.Board.TicTacToBoard;

public class GameOver implements Players{
    public void nextMove(Controller controller, TicTacToBoard Board, Scanner sc){
        System.out.println("Game is Over");
    }
}
