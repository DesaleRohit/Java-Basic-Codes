import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentMarksManager {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Marks Manager");

        System.out.print("How many students you want to enter? ");
        int total = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= total; i++) {
            System.out.print("Enter name of student " + i + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter marks of " + name + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            studentList.add(new Student(name, marks));
        }

        // Find student with highest marks
        Student topStudent = studentList.get(0);
        for (Student s : studentList) {
            if (s.marks > topStudent.marks) {
                topStudent = s;
            }
        }

        System.out.println("\nStudent with highest marks:");
        System.out.println("Name: " + topStudent.name);
        System.out.println("Marks: " + topStudent.marks);

        scanner.close();
    }
}
