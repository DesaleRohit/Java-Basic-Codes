import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); //0
        arr.add(2); //1
        arr.add(3); //2
        System.out.println("ArrayList size :"+arr.size());
        System.out.println(arr.get(2)); //output 3

        for( int i = 0; i < arr.size() ; i++) {
            System.out.println("-->>"+arr.get(i));
        }
    }
}