class Parent {
    int num = 100;
    Parent() {
        System.out.println("Parent Constructor");
    }
    void display() {
        System.out.println("This is Parent class method");
    }
}
class Child extends Parent {
    int num = 200;
    Child() {
        super.display();
        System.out.println("Child Constructor");
    }
    void display() {
        super.display();
        System.out.println("This is Child class method");
    }
    void showNumber() {
        System.out.println("Child number = " + num);
        System.out.println("Parent number = " + super.num);
    }
}
public class SuperKey {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.showNumber();
    }
}