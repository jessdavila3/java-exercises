/**
 * Created by jessedavila on 11/28/16.
 */

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    int score;

    @Override
    public int compareTo(Student other) {
        int last = this.lastName.compareTo(other.lastName);
        return last == 0 ? this.firstName.compareTo(other.firstName) : last;
    }

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
}

