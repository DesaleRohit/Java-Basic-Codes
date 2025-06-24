import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Rohit");
        name.add("Nikhil");
        name.add("Dhanesh");
        name.add("Swapnill");

        System.out.println("All  Names : "+name);
        System.out.println("First Name : "+name.get(0));

        name.remove("Dhanesh");
        System.out.println("After removing name : "+name);
    }
}