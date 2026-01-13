class Demo {
    Demo() {
        this(10);
        System.out.println("Default constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized constructor: " + x);
    }
}
class ThisKeyword3 {
    public static void main(String[] args) {
        new Demo();
    }
}