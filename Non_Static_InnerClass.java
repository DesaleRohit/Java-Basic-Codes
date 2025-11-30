class Outer {
    private String message = "Hello from Outer class";

    class Inner {
        void show() {
            System.out.println(message);  //can access private members
        }
    }
}

public class Non_Static_InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); //way to create inner class object
        inner.show();
    }
}