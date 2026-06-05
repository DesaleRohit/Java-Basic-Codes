import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Nayan");
        list.add("Gagan");
        list.forEach(name -> System.out.println(name));

    }

}
