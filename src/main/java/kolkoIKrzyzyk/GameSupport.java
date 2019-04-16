package kolkoIKrzyzyk;

import kolkoIKrzyzyk.players.Computer;
import kolkoIKrzyzyk.players.Person;
import kolkoIKrzyzyk.players.Player;

import java.util.Random;
import java.util.Scanner;

public class GameSupport {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public boolean fieldChoseCorrect = false;

    public Player whoStarts(Person person, Computer computer) {
        System.out.println("Losowanie kto rozpoczyna grę...wymik:");
        int whoStarts = random.nextInt(2);
        if (whoStarts == 0) {
            System.out.println("Komputer.");
            return computer;
        } else {
            System.out.println("Gracz.");
            return person;
        }
    }

    int numberField;

    public void playPersonVSComputer(Person person, Computer computer, Board board) {
        if (whoStarts(person, computer).equals(computer)) {
            do {
                do {
                    System.out.println("Ruch komputera");
                    numberField = random.nextInt(9) + 1;
                    System.out.println("wylosowana liczba prze komputer " + numberField);
                    takeField(board, computer);
                    if (!whoWon(board)) {
                        break;
                    }
                }while (!fieldChoseCorrect);
                do {
                    System.out.println("Wpisz numer pola, które chcesz zająć");
                    numberField = scanner.nextInt();
                    takeField(board, person);
                }while (!fieldChoseCorrect);
            } while (whoWon(board));
        } else
            do {
                do {
                    System.out.println("Wpisz numer pola, które chcesz zająć");
                    numberField = scanner.nextInt();
                    takeField(board, person);
                    if (!whoWon(board)) {
                        break;
                    }
                } while (!fieldChoseCorrect);
                do {
                    System.out.println("Ruch komputera");
                    numberField = random.nextInt(9) + 1;
                    System.out.println("Wylosowana liczba prze komputer" + numberField);
                    takeField(board, computer);
                }while (!fieldChoseCorrect);
            } while (whoWon(board));

    }


    public void takeField(Board board, Player player) {
        switch (numberField) {
            case 1:
                if (board.getBoard()[0][0] == '1') {
                    board.getBoard()[0][0] = player.getSign();
                    board.showBoard();
                    fieldChoseCorrect = true;
                } else {
                    System.out.println("Ponowne wybór pola");
                    fieldChoseCorrect = false;
                }
                break;
            case 2:
                if (board.getBoard()[0][1] == '2') {
                    board.getBoard()[0][1] = player.getSign();
                    board.showBoard();
                    fieldChoseCorrect = true;
                } else {
                    System.out.println("Ponowne wybór pola");
                    fieldChoseCorrect = false;
                }
                break;
            case 3:
                if (board.getBoard()[0][2] == '3') {
                    board.getBoard()[0][2] = player.getSign();
                    board.showBoard();
                    fieldChoseCorrect = true;
                } else {
                    System.out.println("Ponowne wybór pola");
                    fieldChoseCorrect = false;
                }
                break;
            case 4:
                if (board.getBoard()[1][0] == '4') {
                    board.getBoard()[1][0] = player.getSign();
                    board.showBoard();
                    fieldChoseCorrect = true;
                } else {
                    System.out.println("Ponowne wybór pola");
                    fieldChoseCorrect = false;
                }
                break;
            case 5:
                if (board.getBoard()[1][1] == '5') {
                    board.getBoard()[1][1] = player.getSign();
                    board.showBoard();
                    fieldChoseCorrect = true;
                } else {
                    System.out.println("Ponowne wybór pola");
                    fieldChoseCorrect = false;
                }
                break;

            case 6:
                if (board.getBoard()[1][2] == '6') {
                    board.getBoard()[1][2] = player.getSign();
                    board.showBoard();
                    fieldChoseCorrect = true;
                } else {
                    System.out.println("Ponowne wybór pola");
                    fieldChoseCorrect = false;
                }
                break;
            case 7:
                if (board.getBoard()[2][0] == '7') {
                    board.getBoard()[2][0] = player.getSign();
                    board.showBoard();
                    fieldChoseCorrect = true;
                } else {
                    System.out.println("Ponowne wybór pola");
                    fieldChoseCorrect = false;
                }
                break;
            case 8:
                if (board.getBoard()[2][1] == '8') {
                    board.getBoard()[2][1] = player.getSign();
                    board.showBoard();
                    fieldChoseCorrect = true;
                } else {
                    System.out.println("Ponowne wybór pola");
                    fieldChoseCorrect = false;
                }
                break;
            case 9:
                if (board.getBoard()[2][2] == '9') {
                    board.getBoard()[2][2] = player.getSign();
                    board.showBoard();
                    fieldChoseCorrect = true;
                } else {
                    System.out.println("Ponowne wybór pola");
                    fieldChoseCorrect = false;
                }
                break;
        }
    }

    public boolean whoWon(Board board) {
        if (board.getBoard()[0][0] == board.getBoard()[0][1] && board.getBoard()[0][0] == board.getBoard()[0][2]) {
            System.out.println("Wygrana ");
            return false;
        } else if (board.getBoard()[1][0] == board.getBoard()[1][1] && board.getBoard()[1][0] == board.getBoard()[1][2]) {
            System.out.println("Wygrana ");
            return false;
        } else if (board.getBoard()[2][0] == board.getBoard()[2][1] && board.getBoard()[2][0] == board.getBoard()[2][2]) {
            System.out.println("Wygrana ");
            return false;
        } else if (board.getBoard()[0][0] == board.getBoard()[1][0] && board.getBoard()[0][0] == board.getBoard()[2][0]) {
            System.out.println("Wygrana ");
            return false;
        } else if (board.getBoard()[0][1] == board.getBoard()[1][1] && board.getBoard()[0][1] == board.getBoard()[2][1]) {
            System.out.println("Wygrana ");
            return false;
        } else if (board.getBoard()[0][2] == board.getBoard()[1][2] && board.getBoard()[0][2] == board.getBoard()[2][2]) {
            System.out.println("Wygrana ");
            return false;
        } else if (board.getBoard()[0][0] == board.getBoard()[1][1] && board.getBoard()[0][0] == board.getBoard()[2][2]) {
            System.out.println("Wygrana");
            return false;
        } else if (board.getBoard()[0][2] == board.getBoard()[1][1] && board.getBoard()[0][2] == board.getBoard()[2][0]) {
            System.out.println("Wygrana");
            return false;
        } else if (board.getBoard()[0][0] != '1' && board.getBoard()[0][1] != '2' && board.getBoard()[0][2] != '3' &&
                board.getBoard()[1][0] != '4' && board.getBoard()[1][1] != '5' && board.getBoard()[1][2] != '6' &&
                board.getBoard()[2][0] != '7' && board.getBoard()[2][1] != '8' && board.getBoard()[2][2] != '9') {
            System.out.println("Remis");
            return false;
        }
        return true;
    }
}