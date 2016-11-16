/**
 * Created by jessedavila on 11/16/16.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentInfoApp {
    public static void main(String[] args) {
        String studentName;
        int age = 0;
        String reason;

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("What is your name?");
        studentName = sc.next();

        age = askForAge(sc);

        System.out.println("Why do you want to learn to program?");
        reason = sc.next();
        while (studentName.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }

        System.out.println("student name is " + studentName);
        System.out.println("student age is " + age);
        System.out.println("student wants to learn to code because " + reason);

        sc.close();
    }

    public static int askForAge(Scanner sc) {
        try {
            System.out.println("Your age?");
            int age = sc.nextInt();
            if (age < 0) {
                throw new IllegalArgumentException("age must be positive");
            }
            return age;
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println("invalid age. age must be a whole number");
            return askForAge(sc);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid age. Must be a positive number.");
            return askForAge(sc);
        }
    }
}
