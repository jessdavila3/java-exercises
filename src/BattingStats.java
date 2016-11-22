import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jessedavila on 11/21/16.
 */
public class BattingStats {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
        int numAtBats;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("How many at bats?");
        numAtBats = input.nextInt();
        int[][] average = new int[numAtBats][numAtBats];


        for (int i = 0; i < numAtBats; i++) {
            average[i][i] = getNumBases(i);
            total += average[i][i];
        }
        total /= numAtBats;

        System.out.println("Your average is " + df.format(total));
    }

    public static int getNumBases(int i) {
        Scanner input = new Scanner(System.in);
        int numOfBases;
        System.out.println("How many bases on the bat " + (i+1) +"?");
        numOfBases = input.nextInt();
        try {
            if (numOfBases < 0 || numOfBases > 4) {
                System.out.println("Enter a positive number between 1 - 4");
                return getNumBases(i);
            } else {
                return numOfBases;
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter a positive number between 1 - 4");
            return getNumBases(i);
        }
    }


}
