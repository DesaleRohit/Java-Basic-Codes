import java.util.Arrays;
import java.util.List;

public class ReduceFun {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4);

        int result = list.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(result);
    }
}
