import java.util.ArrayList;
import java.util.List;

public class List_Interface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Meet");
        list.add("Hasamukh");
        list.add("Nilesh");

        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0));
    }
}