class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(x);
        System.out.println(super.x);
    }
}

class SuperKeyword1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}