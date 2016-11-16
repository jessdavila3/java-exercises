/**
 * Created by jessedavila on 11/16/16.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Validator {

    public int getInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        int userInput;

        System.out.println(prompt);

        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            return getInt(prompt);
        }
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userInput = getInt(prompt);
        return userInput;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    // this is the class with all the validating methods
    double number;
    String word;
    String s1,s2;

}
