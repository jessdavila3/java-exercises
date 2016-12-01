package game;

/**
 * Created by jessedavila on 12/1/16.
 */
public class RockPlayer extends Player {

    public RockPlayer(String name) {
        super(name);
    }

    public int getGuess() {
        return 1;
    }

    public void play() {
        generateRoshambo(getGuess());
    }
}
