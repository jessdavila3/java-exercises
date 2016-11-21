import java.util.Scanner;

/**
 * Created by jessedavila on 11/21/16.
 */
public class BattingStats {

    public static void main(String[] args) {
        int numAtBats, numOfBases;

        Scanner input = new Scanner(System.in);

        System.out.println("How many are at bat?");
        numAtBats = input.nextInt();
        int[] average = new int[numAtBats];

        for (int numBats : average) {
            System.out.println("bases?");
            numBats = input.nextInt();
        }

        System.out.println(average);

    }

}
