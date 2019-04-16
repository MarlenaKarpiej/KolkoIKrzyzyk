package kolkoIKrzyzyk;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;


@Getter
@Setter
public class Board {

    Scanner scanner = new Scanner(System.in);
    public char[][] board = new char[3][3];

    public boolean fieldChoseCorrect;

    private char x = '1';

    public Board() {
        this.board = new char[3][3];
    }

    public void showEmptyBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = x;
                x++;
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    GameSupport gameSupport = new GameSupport();

    public char[][] getEmptyBoard() {
        return board;
    }

    public void setEmptyBoard(char[][] board) {
        this.board = board;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

}