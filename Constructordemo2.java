public class Constructordemo2 {
    private int num;

    public Constructordemo2() {
        num = 0;
    }

    public Constructordemo2(int value) {
        num = value;
    }

    public void display() {
        System.out.println("Value of num: " + num);
    }

    public static void main(String[] args) {
        Constructordemo2 obj1 = new Constructordemo2();
        obj1.display();

        Constructordemo2 obj2 = new Constructordemo2(10);
        obj2.display();
    }
}
