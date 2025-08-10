import java.util.LinkedList;
import java.util.Collections;
public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<Integer> items = new LinkedList<>();
        items.add(1);
        items.add(0);
        items.add(8);
        items.add(2);

        System.out.println(items);

        Collections.sort(items); // Sort in assending order

        System.out.println(items);


        
    }
}