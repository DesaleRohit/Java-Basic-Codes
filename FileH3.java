import java.io.File;
import java.io.IOException;

public class FileH3 {
    public static void main(String[] args) {
        File myFile = new File("newfile.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}