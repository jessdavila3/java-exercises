/**
 * Created by jessedavila on 11/11/16.
 */

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        //sout
        boolean keepGoing = true;
        String userInputOne, userInputTwo, userInputThree;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter 3 words: ");
        userInputOne = sc.next();
        userInputTwo = sc.next();
        userInputThree = sc.next();

        System.out.println("You entered: ");
        System.out.println(userInputOne);
        System.out.println(userInputTwo);
        System.out.println(userInputThree);
        while (keepGoing) {
            int userInput;
            double length, width;
            System.out.println("\nwhat are your dimensions?");
            length = sc.nextDouble();
            width = sc.nextDouble();
            System.out.println("The area is: " + rectangle(length,width) + ".");
            System.out.println("keep going?\nPress 1 for yes\nPress 0 for no");
            userInput = sc.nextInt();
            if (userInput != 1) {
                keepGoing = false;
                System.out.println("thanks for playing");
            } else {
                keepGoing = true;
                System.out.println("hey");
            }
        }

    }

    private static double rectangle(double len, double width) {
        return len * width;
    }

}