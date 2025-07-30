import java.util.ArrayList;
public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(50);
        list.add(44);

        System.out.println("First operation :");

        for (int x : list) {
            System.out.println(x);
        }

        list.add(2,80); //add 80 on index 2 push current element forward
        list.set(3,20); //replace 44 with 20

        System.out.println("Second operation :");

        for (int x : list) {
            System.out.println(x);
        }
    }
}