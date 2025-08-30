import java.util.Vector;

public class VectorDemo3 {
    public static void main(String[] args) {

        // Create a Vector
        Vector<String> fruits = new Vector<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits: " + fruits);

        // Insert at a specific index
        fruits.insertElementAt("Apricot", 0);
        System.out.println("After insert at index 0: " + fruits);

        // Access element
        System.out.println("Element at index 1: " + fruits.get(1));

        // Update element
        fruits.set(2, "Blueberry");
        System.out.println("After update: " + fruits);

        // Remove by value and index
        fruits.remove("Apple");
        fruits.removeElementAt(0);
        System.out.println("After removals: " + fruits);

        // Iterate with for-each
        System.out.print("Fruits list: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
