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

class C extends B {
    void print() {
        System.out.println("Class C");
    }
}

class Multilevel_Inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.display();
        c.print();
    }
}
