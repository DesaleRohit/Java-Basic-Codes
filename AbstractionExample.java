abstract class A {

    void voice() {
        System.out.println("voice method from Parent");
    }

    abstract void sound();
}

class B extends A {

    @Override
    void sound() {
        System.out.println("implemented in Child class");

    }

}

class C extends A {
    @Override
    void sound() {
        System.out.println("implemented in Three class ");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        A a = new B();
        a.voice();
        a.sound();

        A obj = new C();
        obj.sound();
    }
}
