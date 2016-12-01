package game;

/**
 * Created by jessedavila on 12/1/16.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        System.out.println("Hey, let's play Roshambo");
        System.out.println("Who do you want to play against?");
        System.out.println("1. Rocks Player\n2. Computer Player\n");
        ComputerPlayer opponent = new ComputerPlayer("Opponent");
        System.out.println("Select a move\n1.Rock\n2.Paper\n3.Scissors");



    }
}
