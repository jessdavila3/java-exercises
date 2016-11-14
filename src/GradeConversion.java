/**
 * Created by jessedavila on 11/14/16.
 */
import java.util.Scanner;

public class GradeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double userGrade;
        char letterGrade;

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
    }
}
