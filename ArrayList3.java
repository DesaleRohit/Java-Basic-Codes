import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        // Adding names
        students.add("Nikhil");
        students.add("Swapnil");
        students.add("Dhanesh");
        students.add("Rohit");
        students.add("Nilesh");
        students.add("Mayur");

        System.out.println("Original List:");
        for (String s : students) {
            System.out.println("-> " + s);
        }

        // Remove a name
        students.remove("Swapnil");

        // Check if a name exists
        if (students.contains("Rohit")) {
            System.out.println("\nRohit is in the list.");
        }

        // Sort the list alphabetically
        Collections.sort(students);

        System.out.println("\nSorted List:");
        for (String s : students) {
            System.out.println("-> " + s);
        }

        // Final size
        System.out.println("\nTotal students: " + students.size());
    }
}
