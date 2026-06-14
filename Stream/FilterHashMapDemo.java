import java.util.HashMap;
import java.util.Map;

public class FilterHashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Spring");
        map.put(4, "R");
        map.put(10, "Go");

        System.out.println("Sort usen keys");
        map.entrySet()
                .stream()
                .filter(s -> s.getKey() > 1)
                .forEach(System.out::println);

        System.out.println("Sort using values");
        map.entrySet()
                .stream()
                .filter(s -> s.getValue().length() > 4)
                .forEach(System.out::println);
    }
}

