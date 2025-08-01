import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        
        // Add elements
        fruits.add("Apple");        // [Apple]
        fruits.addFirst("Banana");  // [Banana, Apple]
        fruits.addLast("Cherry");   // [Banana, Apple, Cherry]
        
        // Remove elements
        fruits.removeFirst();      // [Apple, Cherry]
        fruits.remove("Apple");  
        
        
         System.out.println(fruits);  // [Cherry]
       
    }
}