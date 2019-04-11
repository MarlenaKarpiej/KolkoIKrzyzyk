package kolkoIKrzyzyk;

import kolkoIKrzyzyk.players.Computer;
import kolkoIKrzyzyk.players.Person;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();
        Person person = new Person('O');
        Computer computer = new Computer('X');
        GameSupport gameSupport = new GameSupport();
        System.out.println("Kółko czy krzyżyk ?\nOto plansza:");

        board.showBoards();
        gameSupport.whoStarts(person, computer);
        computer.takeField(board);

        gameSupport.checkFieldIsEmpty(board);
        gameSupport.whoWon(board);


    }
}
