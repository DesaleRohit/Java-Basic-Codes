import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.addFirst(0);
        linkedlist.addLast(4);
        
        System.out.println(linkedlist);
    }
}