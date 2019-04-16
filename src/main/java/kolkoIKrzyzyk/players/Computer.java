package kolkoIKrzyzyk.players;

public class Computer extends Player {

    private char sign;

    public Computer(){
        super();
    }

    public Computer(char sign) {
        this.sign = 'X';
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }
}
