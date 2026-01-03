class Student {
    int rollNo;
    String name;
    int marks;

    void display() {
        System.out.println(rollNo + " " + name + " " + marks);
    }
}

class StudentArray {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].rollNo = 1;
        students[0].name = "Rohit";
        students[0].marks = 85;

        students[1] = new Student();
        students[1].rollNo = 2;
        students[1].name = "Amit";
        students[1].marks = 78;

        students[2] = new Student();
        students[2].rollNo = 3;
        students[2].name = "Neha";
        students[2].marks = 90;

        for (Student s : students) {
            s.display();
        }
    }
}
