import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World This is Java Streams"; 

        String[] words = str.split(" ");

        List<String> result = Arrays.stream(words)
                .map(word -> new StringBuilder(word).reverse().toString()) //reverse each and every word
                .collect(Collectors.toList());

        System.out.println(result);
    }
}