class Parent {
    public Parent() {
        System.out.println(this.hashCode());
    }
}

class Child extends Parent {
    public Child() {
        System.out.println(this.hashCode());
    }
}
public class HashCode {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.hashCode());
    }
}
