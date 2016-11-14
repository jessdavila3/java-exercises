/**
 * Created by jessedavila on 11/14/16.
 */

import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        String userInput;

        Scanner sc = new Scanner(System.in);
        System.out.println("type a word");
        userInput = sc.next();
        char result = userInput.charAt(0);
        if (result == 'a') {
            System.out.println("vowel!");
        }
    }
}
