package kolkoIKrzyzyk;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Board {




//
//
//
    public char[][] board = new char[3][3];
//    private int randomFieldByComputer;
    public boolean fieldChoseCorrect;
//    private int wspolrzednaX;
//
    private char x = '1';
//
    public Board() {
        this.board = new char[3][3];
    }

    public void showBoards() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = x;
                x++;
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }
}