package TicTacTo;

import java.util.Scanner;

import TicTacTo.Board.*;
import TicTacTo.Players.Players1;;

public class index {
    public static void main(String[] args) {
        TicTacToBoard board = new TicTacToBoard(3);
        Scanner sc = new Scanner(System.in);
        Controller controler = new Controller(new Players1());
        controler.nextMove(board, sc);
    }
}
