import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Nikhil");
        name.add("Swapnill");
        name.add("Dhanesh");
        name.add("Rohit");
        name.add("Nilesh");
        name.add("Mayur");

        for (String n : name) {
            System.out.println("-> "+ n);
        }

        System.out.println("Return size: " + name.size());
    }
}
