import java.util.HashMap;

public class HashmapLoop {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Raj", 65);
        hashMap.put("Vishal", 57);
        hashMap.put("Harshal", 45);

        for (String string : hashMap.keySet()) {
            System.out.println("Person : " + string + "\t Weight : " + hashMap.get(string));
        }

    }
}
