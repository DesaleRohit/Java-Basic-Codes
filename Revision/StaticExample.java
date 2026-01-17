class Student {
    int rollNo;
    static String college = "IMRD College";

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(rollNo + " " + college);
    }
}

class StaticExample {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);

        s1.display();
        s2.display();
    }
}
