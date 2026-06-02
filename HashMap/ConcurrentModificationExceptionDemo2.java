import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;

public class ConcurrentModificationExceptionDemo2 extends Thread {
    // static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
    static HashMap<Integer, String> map = new HashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Child Thread Updating Map");
        map.put(104, "User");
    }

    public static void main(String[] args) {

        map.put(101, "Ravi");
        map.put(102, "Vikas");

        ConcurrentModificationExceptionDemo2 obj = new ConcurrentModificationExceptionDemo2();

        obj.start();

        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final Map: " + map);
    }
}