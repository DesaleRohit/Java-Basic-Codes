import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(21);
        list.add(14);
        list.add(9);
        list.add(10);
        list.add(22);
        System.out.println(list);

        List<Integer> list1 = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
