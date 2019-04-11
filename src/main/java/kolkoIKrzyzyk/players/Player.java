package kolkoIKrzyzyk.players;

import kolkoIKrzyzyk.Board;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Player<T> {

    private char sign;

    Scanner scanner = new Scanner(System.in);
    ArrayList<Board> board = new ArrayList<Board>();

    public Player() {
    }


    public void takeField(Board board) {
        int k = scanner.nextInt();
        switch (k) {
            case 1:
                board.getBoard()[0][0] = sign;
                board.showBoards();
                break;
            case 2:
                board.getBoard()[0][1] = sign;
                board.showBoards();
                break;
            case 3:
                board.getBoard()[0][2] = sign;
                board.showBoards();
                break;
            case 4:
                board.getBoard()[1][0] = sign;
                board.showBoards();
                break;
            case 5:
                board.getBoard()[1][1] = sign;
                board.showBoards();
                break;

            case 6:
                board.getBoard()[1][2] = sign;
                board.showBoards();
                break;
            case 7:
                board.getBoard()[2][0] = sign;
                board.showBoards();
                break;
            case 8:
                board.getBoard()[2][1] = sign;
                board.showBoards();
                break;
            case 9:
                board.getBoard()[2][2] = sign;
                board.showBoards();
                break;
        }
    }

}