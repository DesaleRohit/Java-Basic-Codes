class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    private Address address;

    Student(Address address) {
        this.address = address;
    }

    void show() {
        System.out.println(address.city);
    }
}

public class Has_a_Relationship_Aggregation {
    public static void main(String[] args) {
        Address add = new Address("Pune");

        Student student = new Student(add);

        student.show();
    }
}
