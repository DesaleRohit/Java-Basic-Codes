import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNums {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 0, 5, 6);
        List<Integer> list1 = list.stream()
                .map(i -> i * i * i)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
