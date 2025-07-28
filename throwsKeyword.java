import java.io.*;

public class throwsKeyword {

    // Method that declares it may throw an IOException
    public static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");  // May throw FileNotFoundException (subclass of IOException)
        file.read();
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();  // Calling the method that throws an exception
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }

        System.out.println("Rest of the code runs...");
    }
}
