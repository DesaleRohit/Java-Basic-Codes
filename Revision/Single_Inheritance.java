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

class Single_Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.display();
    }
}
