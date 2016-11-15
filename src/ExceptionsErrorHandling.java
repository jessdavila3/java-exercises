/**
 * Created by jessedavila on 11/15/16.
 */
import java.util.Scanner;

public class ExceptionsErrorHandling {
    public static void getInfo() {
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
        System.out.println("Your name is "+name+". You're "+age+" years old.\nYou want to program because\n"+why);
    }

    public static void main(String[] args) {
        getInfo();
    }
}
