import java.io.File;
public class FileH1 {
    public static void main(String[] args) {
        File f1 = new File("demofile.txt");
        System.out.println(f1.exists());      //  it return false because demofile is not available
    }
}