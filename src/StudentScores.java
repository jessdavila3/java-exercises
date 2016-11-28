import java.util.*;

/**
 * Created by jessedavila on 11/28/16.
 */
public class StudentScores {
    public static void main(String[] args) {
        String firstName, lastName;
        int score, keepGoing;

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to this thing");

        do {
            System.out.println("What is the first name?");
            firstName = sc.nextLine();
            System.out.println("And the last name?");
            lastName = sc.nextLine();
            System.out.println("Score?");
            score = sc.nextInt();

            Student newStudent = new Student(firstName,lastName,score);
            students.add(newStudent);

            System.out.println("Continue?");
            keepGoing = sc.nextInt();
            sc.nextLine();
        } while (keepGoing == 1);

        Collections.sort(students);
        for(Student student: students) {
            System.out.println(student.lastName +" " + student.firstName);
            System.out.println("Score: " + student.score);
            System.out.println("-----");
        }



    }
}
