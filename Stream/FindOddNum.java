import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 40, 22, 11, 12, 15);
        List<Integer> list1 = list.stream()
                .filter(i->i%2==1)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
