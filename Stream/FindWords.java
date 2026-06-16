import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWords {
    public static void main(String[] args) {
        String str = "Java Stream API makes Java Programming Powerful. It introduce in Java_8";

        List<String> result = Arrays.stream(str.split(" "))
                .filter(word -> word.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}