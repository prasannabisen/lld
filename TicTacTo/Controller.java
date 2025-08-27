package TicTacTo;

import java.util.Scanner;

import TicTacTo.Board.TicTacToBoard;
import TicTacTo.Players.Players;

public class Controller {
    private Players player;

    Controller(Players player) {
        this.player = player;
    }

    public void setPlayer(Players player){
        this.player = player;
    }

    public void nextMove(TicTacToBoard Board, Scanner sc){
        this.player.nextMove(this, Board, sc);
    }
}
