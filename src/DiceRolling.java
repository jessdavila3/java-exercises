import java.util.Scanner;

/**
 * Created by jessedavila on 11/14/16.
 */
public class DiceRolling {
    public static void main(String[] args) {
        int diceSides, dieOne, dieTwo;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many sides are on the dice?");
        diceSides = sc.nextInt();

        int diceRoll = (int)Math.floor(Math.random() * diceSides + 1);
        dieOne = diceRoll;
    }
}
