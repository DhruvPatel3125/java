import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class STUDENT {
    int roll;
    String name;

    STUDENT(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ArrayList<STUDENT> students = new ArrayList<>();

        // Take input for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            students.add(new STUDENT(roll, name));
        }

        // Sort the students by name in ascending order
        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));

        // Print student data with an interval of 10 ms
        for (STUDENT student : students) {
            System.out.println(student);
            Thread.sleep(10); // 10 ms interval
        }

        sc.close();
    }
}
