import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("new.txt")) {
            writer.write("I am writing using FileWriter class");
            System.out.println("File has been written");
        } catch (Exception e) {
            System.out.println("Could not write in file");
        }
    }
}
