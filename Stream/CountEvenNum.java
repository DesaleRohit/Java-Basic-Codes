import java.util.Arrays;
import java.util.List;

public class CountEvenNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
      long count = list.stream()
              .filter(i->i % 2 == 0)
              .count();
        System.out.println(count);
    }
}
