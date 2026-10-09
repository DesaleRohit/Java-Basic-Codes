import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 10, 20, 50, 80, 90);

        List<String> names = Arrays.asList(
                "Rohit", "Amit", "Rahul", "Ankit", "Priya");

        // 1. Print all number using streams
        list.stream()
                .forEach(System.out::println);

    }
}
