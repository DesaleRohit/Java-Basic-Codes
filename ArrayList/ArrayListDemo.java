import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(11);

        list.add(1, 10);
        System.out.println(list);

        System.out.println(list.get(2));
        list.set(1, 50);
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

    }
}
