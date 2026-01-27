class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display() {
        System.out.println("Class B");
    }
}

class C extends A {
    void print() {
        System.out.println("Class C");
    }
}

class Hierarchical_Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        C c = new C();
        c.show();
    }
}
