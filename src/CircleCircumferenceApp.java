import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jessedavila on 11/30/16.
 */
public class CircleCircumferenceApp {
    public static void main(String[] args) {
        double radius;
        String keepGoing;
        Scanner sc = new Scanner(System.in);

        ArrayList<Circle> circles = new ArrayList<>();

        do {
        System.out.println("What is the circle's radius?");
        radius = Double.parseDouble(sc.nextLine());

        Circle newCircle = new Circle(radius);
            circles.add(newCircle);

        System.out.println(newCircle.getFormattedCircumference());
        System.out.println(newCircle.getFormattedArea());

        System.out.println("Would you like to ask about another circle?");
        keepGoing = sc.nextLine();
        } while (keepGoing.equalsIgnoreCase("y"));

        System.out.println("Goodbye!\nYou asked about " +circles.size() + " circles");
    }
}
