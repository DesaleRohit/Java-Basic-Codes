@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

public class Functional_Interface {
    public static void main(String[] args) {
        Sum sum = (a, b) -> (a + b);
        System.out.println("Addition is " + sum.add(10, 5));
    }
}
