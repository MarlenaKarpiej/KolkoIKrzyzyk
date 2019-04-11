package kolkoIKrzyzyk;

import kolkoIKrzyzyk.players.Computer;
import kolkoIKrzyzyk.players.Person;
import kolkoIKrzyzyk.players.Player;

import java.util.Random;

import static sun.audio.AudioPlayer.player;

public class GameSupport {

    Random random = new Random();
    Board board = new Board();

    public boolean fieldChoseCorrect;

    public Player whoStarts(Person person, Computer computer) {
        System.out.println("Losujemy kto zaczyna...wymik:");
        int whoStarts = random.nextInt(2);
        if (whoStarts == 0) {
            System.out.println("Rozpoczyna komputer \nWpisz numer pola, które chcesz zająć");
            return computer;
        } else {
            System.out.println("Rozpoczyna gracz \nWpisz numer pola, które chcesz zająć");
            return person;
        }
    }

    public void checkFieldIsEmpty (Board board) {
        if (board.getBoard()[0][0] == '1') {
            board.getBoard()[0][0] = 'O';
            for (int i = 0; i < board.getBoard().length; i++) {
                for (int j = 0; j < board.getBoard().length; j++) {
                    System.out.print(board.board[i][j] + " ");
                }
                System.out.println();
            }
            fieldChoseCorrect = true;
        } else {
            System.out.println("Ponowne losowanie pola");
            fieldChoseCorrect = false;
        }
    }



    public void whoWon(Board board) {
        if (board.getBoard()[0][0] == board.getBoard()[0][1] && board.getBoard()[0][0] == board.getBoard()[0][2]) {
            System.out.println("Wygrana ");
        } else if (board.getBoard()[1][0] == board.getBoard()[1][1] && board.getBoard()[1][0] == board.getBoard()[1][2]) {
            System.out.println("Wygrana ");
        } else if (board.getBoard()[2][0] == board.getBoard()[2][1] && board.getBoard()[2][0] == board.getBoard()[2][2]) {
            System.out.println("Wygrana ");
        } else if (board.getBoard()[0][0] == board.getBoard()[1][0] && board.getBoard()[0][0] == board.getBoard()[2][0]) {
            System.out.println("Wygrana " );
        } else if (board.getBoard()[0][1] == board.getBoard()[1][1] && board.getBoard()[0][1] == board.getBoard()[2][1]) {
            System.out.println("Wygrana " );
        } else if (board.getBoard()[0][2] == board.getBoard()[1][2] && board.getBoard()[0][2] == board.getBoard()[2][2]) {
            System.out.println("Wygrana " );
        } else if (board.getBoard()[0][0] == board.getBoard()[1][1] && board.getBoard()[0][0] == board.getBoard()[2][2]) {
            System.out.println("Wygrana" );
        } else if (board.getBoard()[0][2] == board.getBoard()[1][1] && board.getBoard()[0][2] == board.getBoard()[2][0]) {
            System.out.println("Wygrana" );
        } else if (board.getBoard()[0][0] != '1' && board.getBoard()[0][1] != '2' && board.getBoard()[0][2] != '3' &&
                board.getBoard()[1][0] != '4' && board.getBoard()[1][1] != '5' && board.getBoard()[1][2] != '6' &&
                board.getBoard()[2][0] != '7' && board.getBoard()[2][1] != '8' && board.getBoard()[2][2] != '9') {
            System.out.println("Remis");
        }
   }
}