import java.util.Scanner;

/**
 * Created by jessedavila on 11/14/16.
 */
public class TableOfPowers {
    public static void main(String[] args) {
        int userInt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        userInt = sc.nextInt();

        for (int i = 1; i <= userInt; i++) {
            int square, cube;
            square = i * i;
            cube = i * i * i;
            System.out.println("square for " + i + ": " + square);
            System.out.println("cube for " + i + ": " + cube);
            System.out.println("------");
        }
    }
}
