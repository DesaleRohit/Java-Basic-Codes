class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Child class method");
        super.display();
    }
}

class SuperKeyword2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}