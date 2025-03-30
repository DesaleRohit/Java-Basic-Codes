abstract class Demo1 {
    public int id = 10;
    public String Name = "Rohit";

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + Name);
    }
}

class Demo2 extends Demo1 {

}

public class Abstract_Class {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.display();
    }
}
