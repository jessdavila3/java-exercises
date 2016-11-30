import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jessedavila on 11/30/16.
 */
public class CircleCircumferenceApp {
    public static void main(String[] args) {
        String keepGoing;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the circle app...\n");
        do {
            Circle newCircle = new Circle(getRadius(sc));

            System.out.println("\n-----\n"+newCircle.getFormattedCircumference());
            System.out.println(newCircle.getFormattedArea()+"\n-----\n");

            System.out.println("Would you like to ask about another circle?");
            keepGoing = sc.nextLine();
        } while (keepGoing.equalsIgnoreCase("y"));
        System.out.println("Goodbye!\nYou asked about " + Circle.getObjectCount() + " circles");
    }

    private static double getRadius(Scanner sc) {
        System.out.println("What is the circle's radius?");
        try {
            return Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number.");
        }
        return getRadius(sc);
    }
}
