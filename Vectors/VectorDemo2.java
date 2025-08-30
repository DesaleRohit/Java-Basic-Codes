import java.util.Vector;
public class VectorDemo2 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3,2);     /*If we do not pass parameter the default capacity is 10 it increase 2x time..
                                                          But when we pass capacity and Increament capacity parameter it increase like 3+2..*/
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector.capacity());

        vector.add(4);
        vector.add(5);
        System.out.println(vector.capacity());
        


    }
}