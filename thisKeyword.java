class Example {
    private int x;
    private int y;

    public void Fun1(int x , int y) {
        this.x = x;
        this.y = y;
    }
    public void show() {
        int x = 2;
        int y = 5;
        System.out.println(this.x);
        System.out.println(this.y);
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.Fun1(10,21);
        ex.show();

        // Example ex2 = new Example();
        // ex2.Fun1(20,30);
        // ex2.show();
    }
}