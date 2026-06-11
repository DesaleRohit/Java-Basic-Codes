import java.util.Arrays;
import java.util.List;

public class GreaterNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 15, 35, 20);
        List<Integer> list1 = list.stream()
                .filter(i -> i > 20)
                .toList();
        System.out.println(list1);
    }
}
