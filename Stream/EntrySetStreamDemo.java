import java.util.HashMap;
import java.util.Map;

public class EntrySetStreamDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Spring");

        map.entrySet().stream().forEach(System.out::println);
    }
}
