import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileH5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("user_input.txt");

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");

            writer.close();
            System.out.println("User input successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        } finally {
            scanner.close();
        }
    }
}
