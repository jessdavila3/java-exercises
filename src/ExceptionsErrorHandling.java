/**
 * Created by jessedavila on 11/15/16.
 */
import java.util.Scanner;

public class ExceptionsErrorHandling {
    String[] names = {"Jess","Jen", "John"};
    String[] why = {"it's fun", "good pay", "I like typing"};
    int[] ages = {24,27,22};

    public static void addInfo() {
        String name, whyCode;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("what's the student's name?");
        name = sc.next();
        System.out.println("how old are they?");
        age = sc.nextInt();
        System.out.println("Why program?");
        whyCode = sc.nextLine();
        studentInfo(name,age,whyCode);
    }

    public static void studentInfo(String name, int age, String why) {
        System.out.println("Your name is "+name+". You're "+age+" years old.\nYou want to program because"+why);
    }

    public static void main(String[] args) {
        addInfo();
        System.out.println(names[1]);

    }
}
