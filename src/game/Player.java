package game;

/**
 * Created by jessedavila on 12/1/16.
 */
public class Player {
    Roshambo choice;

    public Player(String name) {
        this.name = name;
    }

    String name;

    public Roshambo generateRoshambo(int num) {
        if (num == 1) {
            return choice.ROCK;
        } else if (num == 2) {
            return choice.PAPER;
        } else if (num == 3) {
            return choice.SCISSORS;
        } else {
            return null;
        }
    }
}
