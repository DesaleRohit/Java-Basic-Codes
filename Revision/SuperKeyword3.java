class Parent {
    Parent() {
        System.out.println("Parent class contructor");
    }
}
class Child extends Parent {
    Child() {
        super();
        System.out.println("Child class contructor");
    }
}
class SuperKeyword3 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}