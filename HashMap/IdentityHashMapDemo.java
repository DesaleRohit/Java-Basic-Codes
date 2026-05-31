import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        map.put(i1, "Gagan");
        map.put(i2, "Nayan");

        System.out.println(i1 == i2); // false , It is use in IdentityHashMap
        System.out.println(i1.equals(i2)); // true , It is use in HashMap

        System.out.println(map);
    }
}