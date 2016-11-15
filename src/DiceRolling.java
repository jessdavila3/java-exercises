import java.util.Scanner;

/**
 * Created by jessedavila on 11/14/16.
 */
public class DiceRolling {
    public static void main(String[] args) {
        int diceSides;
        int dieOne = 1, dieTwo = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many sides are on the dice?");
        diceSides = sc.nextInt();
        dieOne = rollDie(dieOne,diceSides);
        dieTwo = rollDie(dieTwo,diceSides);

        System.out.println("1: " + dieOne);
        System.out.println("2: " + dieTwo);

    }

    public static int rollDie(int die, int diceSides) {
        die = (int)Math.ceil(Math.random() * diceSides);
        return die;
    }
}
