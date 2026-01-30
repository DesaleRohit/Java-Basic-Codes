class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child display");
        super.display();
    }
}

class SuperKeyword4 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}