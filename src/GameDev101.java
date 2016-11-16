import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jessedavila on 11/16/16.
 */
public class GameDev101 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Welcome to the Guessing Game");
        do {
            i++;
            playGame();
        } while (i < 5);
    }

    public static int getRandomInt() {
        return (int) Math.ceil(Math.random()*100);
    }

    public static int getGuess() {
        int userInput = 0;
        System.out.println("I'm thinking of a random number. What do you suppose it is?");
        try {
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();
            if (userInput < 1 || userInput > 100) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("put in a number that isn't words");
            return getGuess();
        }
        return userInput;
    }

    public static boolean checkEntry(double randomNumber, double userNumber) {
        boolean correct = false;
        if (userNumber > randomNumber) {
            System.out.println("lower!");
            correct = false;
         } else if (userNumber < randomNumber) {
            System.out.println("higher!");
            correct = false;
        } else if (userNumber == randomNumber) {
            System.out.println("you got it!\nCongrats!");
            correct = true;
        }
        return correct;
    }

    public static void playGame() {
        double randomNumber;
        int userGuess;
        randomNumber = getRandomInt();
        System.out.println(randomNumber);
        do {
            userGuess = getGuess();
            checkEntry(randomNumber,userGuess);
        } while (randomNumber != userGuess);
    }

}
