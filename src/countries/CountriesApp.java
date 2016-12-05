package countries;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jessedavila on 12/5/16.
 */
public class CountriesApp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int userChoice;
        CountriesTextFile countryFile = new CountriesTextFile();
        countryFile.getFolder();
        countryFile.getFile();

        do {
            System.out.println("Enter 1 to read the list of countries\nEnter 2 to write a name to the list\nEnter 3 to exit");
            userChoice = Integer.parseInt(sc.nextLine());
            if (userChoice == 1) {
                countryFile.readFile();
            } else if (userChoice == 2) {
                countryFile.writeFile();
            }
        } while (userChoice != 3);

        System.out.println("Goodbye!");
    }
}
