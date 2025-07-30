import java.util.ArrayList;
public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        /*System.out.println("Removed 1 :" +list.remove(1));  //it remove integer on index : 1
        System.out.println(list);*/

        System.out.println("Remove 1 :" +list.remove(Integer.valueOf(1))); // it actual remove 1 number from ArryList
          System.out.println(list);

            System.out.println(list.contains(1));
    }
}