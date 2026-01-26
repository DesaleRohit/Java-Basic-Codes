interface A {
    void fun1();
}

interface B extends A {
    void fun2();
}

class C implements B {
    public void fun1() {
        System.out.println("This is Function 1");
    }

    public void fun2() {
        System.out.println("This is Function 2");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        C c = new C();
        c.fun1();
        c.fun2();
    }
}