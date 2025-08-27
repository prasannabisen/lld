package TicTacTo.Board;

import java.util.ArrayList;
import java.util.List;

import TicTacTo.Players.Pices;

public class TicTacToBoard {
    private List<List<Pices>> board;

    public TicTacToBoard(int size) {
        this.board = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Pices> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(Pices.Empty);
            }
            this.board.add(row);
        }
    }

    public void setPice(int x, int y, Pices pice) {
        board.get(x).set(y, pice);
    }

    public void printBoard() {
        for (int i = 0; i < this.board.size(); i++) {
            for (int j = 0; j < this.board.get(i).size(); j++) {
                System.out.print(board.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }

    public boolean isGameOver() {
        for (int i = 0; i < this.board.size(); i++) {
            Pices currentPice = this.board.get(i).get(0);
            if (currentPice == Pices.Empty)
                continue;
            boolean flag = true;
            for (int j = 1; j < this.board.get(i).size(); j++) {
                if (this.board.get(i).get(j) == Pices.Empty || this.board.get(i).get(j) != currentPice) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
        }

        for (int i = 0; i < this.board.size(); i++) {
            Pices currentPice = this.board.get(0).get(i);
            if (currentPice == Pices.Empty)
                continue;
            boolean flag = true;
            for (int j = 1; j < this.board.size(); j++) {
                if (this.board.get(j).get(i) == Pices.Empty || this.board.get(j).get(i) != currentPice) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
        }

        Pices currentPice = this.board.get(0).get(0);
        if (currentPice != Pices.Empty) {
            boolean flag = true;
            for (int i = 1; i < this.board.size(); i++) {
                if (this.board.get(i).get(i) != currentPice) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
        }
        return false;
    }
}