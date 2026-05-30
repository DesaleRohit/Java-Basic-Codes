import java.util.HashMap;

public class HashmapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Rohit", 111);
        hashMap.put("Nayan", 505);
        hashMap.put("Gagan", 100);

        hashMap.put("Vishal", 111);
        hashMap.put("Jayesh", 505);
        hashMap.put("Amit", 100);

        System.out.println(hashMap);
        hashMap.put("Rohit", 777); // Overwritten the Rohit value
        System.out.println(hashMap);

        hashMap.remove("Rohit"); // remove key-value pair
        System.out.println(hashMap);

        System.out.println("Size : " + hashMap.size()); // return size

        System.out.println("Return value of Nayan : " + hashMap.get("Nayan")); // return value of that key

        System.out.println(hashMap.containsKey("Rohit")); // return false but if key exist it return true

        System.out.println(hashMap.keySet()); // return all keys present in HashMap [Amit, Nayan, Gagan, Vishal, Jayesh]

        System.out.println(hashMap.values()); // return all values of present keys

    }
}