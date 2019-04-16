package kolkoIKrzyzyk.players;

import java.util.Scanner;

public class Person extends Player {

    private char sign;


    public Person(){
        super();
    }


    public Person(char sign) {
        this.sign = 'O';
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

}
