public class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 20),
            new Student("Bob", 22)
        };
        
        for (Student s : students) {
            s.display();
        }
    }
}
