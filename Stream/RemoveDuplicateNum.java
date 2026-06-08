import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40);
        System.out.println(list);
        List<Integer> list1 = list.stream()
                .distinct()
                .toList();
        System.out.println(list1);
    }
}
