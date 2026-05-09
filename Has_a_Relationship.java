class Address {
    String city = "Pune";
}

class Student {

    Address ad = new Address();

    void show() {
        System.out.println(ad.city);
    }
}

public class Has_a_Relationship {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.show();
    }
}
