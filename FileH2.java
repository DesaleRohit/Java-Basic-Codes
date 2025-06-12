import java.io.File;
public class FileH2 {
    public static void main(String[] args) {
        File f1 = new File("A.txt");
       System.out.println(f1.canWrite());
        System.out.println(f1.length());
    }
}