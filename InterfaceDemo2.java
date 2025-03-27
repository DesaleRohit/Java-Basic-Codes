interface A {
    default void A1() {
        System.out.println("This is A1 Function");
    }
}
interface B {
    default void B2() {
        System.out.println("This is B2 Function");
    }
}
class Democlass implements A, B {
    
}
public class InterfaceDemo2  {
    public static void main(String[] args) {
        Democlass democlass = new Democlass();
        democlass.A1();
        democlass.B2();
         
    }
}