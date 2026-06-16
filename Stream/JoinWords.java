import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinWords {
    public static void main(String[] args) {
        String str = "Java Stream API makes Java Programming Powerful";

        String result = Arrays.stream(str.split(" "))
                .collect(Collectors.joining("-"));

        System.out.println(result);
    }
}