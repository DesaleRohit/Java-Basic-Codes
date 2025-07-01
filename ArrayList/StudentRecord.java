import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecord {

    static class Student {
        private String name;
        private int roll_no;
        private String address;

        public void setName(String name) {
            this.name = name;
        }

        public void setRoll_no(int roll_no) {
            this.roll_no = roll_no;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public int getRoll_no() {
            return roll_no;
        }

        public String getAddress() {
            return address;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n Student Record Manager");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    Student s = new Student();
                    System.out.print("Enter Name: ");
                    s.setName(sc.nextLine());

                    System.out.print("Enter Roll Number: ");
                    s.setRoll_no(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter Address: ");
                    s.setAddress(sc.nextLine());

                    students.add(s);
                    System.out.println("Student Added!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("Student List:");
                        for (Student stu : students) {
                            System.out.println("Roll: " + stu.getRoll_no() +
                                               ", Name: " + stu.getName() +
                                               ", Address: " + stu.getAddress());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;

                    for (Student stu : students) {
                        if (stu.getRoll_no() == roll) {
                            System.out.println("Student Found:");
                            System.out.println("Name: " + stu.getName());
                            System.out.println("Address: " + stu.getAddress());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found. ");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
