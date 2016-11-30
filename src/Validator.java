
import java.util.Scanner;
import java.util.InputMismatchException;

public class Validator {
    // this is the class with all the validating methods

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

        try {
            if(userInput < min || userInput > max) {
                throw new InputMismatchException();
            }
            return userInput;
        } catch (InputMismatchException e) {
            return getIntWithinRange(prompt, min, max);
        }


    }

    public double getDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        double userDouble;

        System.out.println(prompt);
        try {
            userDouble = sc.nextDouble();
            sc.close();
            return userDouble;
        } catch (Exception e) {
            System.out.println("nope");
            return getDouble(prompt);
        }

    }

    public static String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println(prompt);
        userInput = sc.nextLine();
        return userInput;
    }
//
//    public double getDoubleWithinRange(String prompt, double min, double max) {
//
//    }
//
//    public String getRequiredString(String prompt) {
//
//    }
//
//    public String getChoiceString(String prompt, String s1, String s2) {
//
//    }

}