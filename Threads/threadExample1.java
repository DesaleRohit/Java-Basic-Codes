class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class threadExample1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // create object
        t1.start();                   // start the thread
    }
}