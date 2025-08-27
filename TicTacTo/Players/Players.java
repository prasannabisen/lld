package TicTacTo.Players;

import java.util.Scanner;

import TicTacTo.Controller;
import TicTacTo.Board.TicTacToBoard;

public interface Players {
    public void nextMove(Controller controller, TicTacToBoard Board, Scanner sc);
}
