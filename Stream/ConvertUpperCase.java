import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ruby", "go", "java");
        System.out.println(list);
        List<String> list1 = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
