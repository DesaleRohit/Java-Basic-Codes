import java.util.LinkedHashMap;

class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> li = new LinkedHashMap<>();
        li.put("101", "Nayan");
        li.put("102", "Gagan");
        li.put("105", "Amit");
        li.put("100", "Jayesh");

        System.out.println(li); // return {101=Nayan, 102=Gagan, 105=Amit, 100=Jayesh}
                                // beacuse insertion order in preseve in LinkedHashMap

    }
}`