import java.util.Arrays;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(50, 10, 30, 20);
        System.out.println("Before Sorting: " + list);
        List<Integer> list1 = list.stream()
                .sorted()
                .toList();
        System.out.println("After sorting: " + list1);
    }
}
