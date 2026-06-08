import java.util.Arrays;
import java.util.Objects;

public class RemoveEmptyString {
    public static void main(String[] args) {
        String[] str = {"Python", " ", "Go", "Ruby", "", null};

        String[] arr = Arrays.stream(str)
                .filter(Objects::nonNull)
                .filter(s -> !s.isBlank())
                .toArray(String[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
