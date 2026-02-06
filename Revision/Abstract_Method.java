abstract class New {
    abstract void check(String name); 
}

public class Abstract_Method extends New {
    @Override
    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Abstract_Method obj = new Abstract_Method(); 
        obj.check("Hello");
    }
}