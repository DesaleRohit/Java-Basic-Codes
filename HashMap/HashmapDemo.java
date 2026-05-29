import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Raj");
        hm.put(102, "Nayan");
        hm.put(103, "Gagan");
        hm.put(104, "Om");

        System.out.println(hm); // {101=Raj, 102=Nayan, 103=Gagan, 104=Om}

        System.out.println(hm.get(103)); // return Gagan

        System.out.println(hm.size()); // returns size (4)

        hm.remove(102);
        System.out.println(hm);

        System.out.println(hm.get(108));// it return null

        hm.clear();
        System.out.println(hm); // {}
    }
}
