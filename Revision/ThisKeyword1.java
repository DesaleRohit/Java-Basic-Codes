class Student {
    int roll;

    void setRoll(int roll) {
        this.roll = roll;
    }
    void show() {
        System.out.println(roll);
    }
}

class ThisKeyword1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRoll(10);
        s.show();
    }
}