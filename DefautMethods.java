interface Parent {
    default void sayHello() {
        System.out.println("message from interface");
    }
}

class Child implements Parent {
    public void sayHello() {
        Parent.super.sayHello();
        System.out.println("message from child class");
    }
}

public class DefautMethods {
    public static void main(String[] args) {
        // Parent p = new Child();
        // p.sayHello();

        Child c = new Child();
        c.sayHello();
    }
}
