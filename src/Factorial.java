import java.util.Scanner;

/**
 * Created by jessedavila on 11/14/16.
 */

public class Factorial {
    public static void main(String[] args) {
        int userInt;
        boolean keepGoing;
        String yesNo;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter a num from 1 to 25");
            userInt = sc.nextInt();
            while (userInt > 25 || userInt < 1) {
                System.out.println("not that number");
                userInt = sc.nextInt();
            }
            System.out.println(userInt + "! is: " + factorial(userInt));
            System.out.println("Continue? y or n");
            yesNo = sc.next();
            if (yesNo.equals("y")) {
                keepGoing = true;
            } else {
                keepGoing = false;
            }
        } while (keepGoing);

    }


    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

