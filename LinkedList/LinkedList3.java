import java.util.LinkedList;
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<Integer> items = new LinkedList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        System.out.println("Element on Index 3 :-> "+items.get(3)); //element access using Index number
        items.set(3,10); // replace element 
        System.out.println(items);
        System.out.println("Size of List :-> "+items.size());

    }
}