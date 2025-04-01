interface One {
    static void Fun1() {
        System.out.println("This is Function 1");
    }

}

interface Two extends One {
    static void Fun2() {
        System.out.println("This is Function 2");
    }
}

// class Myclass implements Two {
//     // No need to implement static methods because they belong to the interface
// }

public class InterfaceDemo4 {
    public static void main(String[] args) {
        Two.Fun2();
        One.Fun1();
    }
}
