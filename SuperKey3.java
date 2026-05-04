class Person {
    int rollNo;
    String name;

    public Person(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class Student extends Person{
    String subject;
    int marks;

    public Student(int rollNo, String name, String subject, int marks) {
        super(rollNo, name);
        this.subject = subject;
        this.marks = marks;
    }
}

public class SuperKey3 {
    public static void main(String[] args) {
        Student s = new Student(1, "Nayan", "C++", 60);
        System.out.println(s.rollNo);
        System.out.println(s.name);
        System.out.println(s.subject);
        System.out.println(s.marks);
    }
}
