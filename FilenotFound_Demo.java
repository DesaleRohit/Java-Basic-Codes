import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FilenotFound_Demo {
    public static void main(String[] args) {

        try {
            File file = new File("D://file.txt");
            FileReader fr = new FileReader(file);

            System.out.println("File opened successfully");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}