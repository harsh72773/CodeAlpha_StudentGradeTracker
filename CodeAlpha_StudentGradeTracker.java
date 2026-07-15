import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class CodeAlpha_StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Student Project Tracker ======");

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Input student details
        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i);

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name, grade));
        }
        sc.close();
    }
}