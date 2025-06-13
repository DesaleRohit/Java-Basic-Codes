import java.io.FileWriter;
import java.io.IOException;

public class FileH4 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is a file writing example.\n");
            writer.write("Java makes file handling easy!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing.");
        }
    }
}
