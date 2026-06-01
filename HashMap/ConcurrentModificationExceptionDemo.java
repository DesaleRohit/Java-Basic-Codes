import java.util.HashMap;

public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "Raj");
        hashMap.put(102, "Dip");

        for (Integer string : hashMap.keySet()) {
            hashMap.put(103, "Rohit");
            System.out.println(string);
        }
    }
}
