import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jessedavila on 11/14/16.
 */
public class DiceRolling {
    public static void main(String[] args) {
        diceGame();

    }

    public static int rollDie(int die, int diceSides) {
        die = (int)Math.ceil(Math.random() * diceSides);
        return die;
    }

    public static void diceGame() {
        int diceSides;
        String keepGoing = "y";
        Scanner sc = new Scanner(System.in);
        while (keepGoing.equals("y")) {
            int dieOne = 1, dieTwo = 1;
            System.out.println("how many sides are on the dice?");
            while (keepGoing.equals("y")) {
                try {
                    diceSides = sc.nextInt();
                    dieOne = rollDie(dieOne,diceSides);
                    dieTwo = rollDie(dieTwo,diceSides);
                    System.out.println("Die 1: " + dieOne);
                    System.out.println("Die 2: " + dieTwo);
                    System.out.println("Total: " + (dieOne + dieTwo));
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("nope");
                }
            }
            System.out.println("keep going? (y/n)");
            keepGoing = sc.next();

        }
        System.out.println("thanks for playing");

    }
}
