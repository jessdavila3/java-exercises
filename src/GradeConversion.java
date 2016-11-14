/**
 * Created by jessedavila on 11/14/16.
 */
import java.util.Scanner;

public class GradeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double userGrade;
        char letterGrade;
        int again;
        boolean keepGoing = false;



        do {
            System.out.println("What was your grade?");
            userGrade = sc.nextDouble();

            if (userGrade >= 88) {
                letterGrade = 'A';
            } else if (userGrade >= 80) {
                letterGrade = 'B';
            } else if (userGrade >= 67) {
                letterGrade = 'C';
            } else if (userGrade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

        System.out.println("Your letter grade is: " + letterGrade);

        System.out.println("keep going?\nType '1' to continue.");
        again = sc.nextInt();

        if (again == 1) {
            keepGoing = true;
        } else if (again != 1) {
            keepGoing = false;
        }

        } while (keepGoing);

        System.out.println("Thanks for playing...");
    }
}
