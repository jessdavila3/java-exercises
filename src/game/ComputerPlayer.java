package game;

/**
 * Created by jessedavila on 12/1/16.
 */
public class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
    }

    private int getGuess() {
        return (int)Math.ceil(Math.random() * 3);
    }

    public void play() {
        generateRoshambo(getGuess());
    }
}
