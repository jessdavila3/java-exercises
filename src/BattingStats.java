import java.util.Scanner;

/**
 * Created by jessedavila on 11/21/16.
 */
public class BattingStats {

    public static void main(String[] args) {
        int numAtBats;
        int total = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("How many at bats?");
        numAtBats = input.nextInt();
        int[][] average = new int[numAtBats][numAtBats];

        for (int i = 0; i < numAtBats; i++) {
            average[i][i] = numBases();
            System.out.println(average[i][i]);
            total += average[i][i];
        }
        total /= numAtBats;

        System.out.println("Your average is " + total);
    }

    public static int numBases() {
        Scanner input = new Scanner(System.in);
        int numOfBases;
        System.out.println("How many bases?");
        numOfBases = input.nextInt();
        return numOfBases;

    }

}
