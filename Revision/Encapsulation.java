class Employee {
    private int id;
    private String name;
    private double salary;

    void setData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void show() {
        System.out.println(id + " " + name + " " + salary);
    }
}

class Encapsulation {
    public static void main(String[] args) {

        Employee[] emp = new Employee[2];

        emp[0] = new Employee();
        emp[0].setData(101, "Ravi", 25000);

        emp[1] = new Employee();
        emp[1].setData(102, "Kiran", 30000);

        for (Employee e : emp) {
            e.show();
        }
    }
}
