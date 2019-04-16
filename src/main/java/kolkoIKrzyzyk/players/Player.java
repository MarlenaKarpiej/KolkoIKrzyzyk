package kolkoIKrzyzyk.players;

public abstract class Player<T> {

    private char sign;

    public Player() {
    }

//    public int numberTakeField() {
//        return numberTakeField();
//    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

}