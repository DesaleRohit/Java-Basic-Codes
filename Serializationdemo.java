import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}

public class Serializationdemo {
    public static void main(String[] args) throws Exception {
        Employee empl = new Employee(1, "Gagan", 50000.00);
        FileOutputStream file = new FileOutputStream("employee.ser");
        ObjectOutputStream obj = new ObjectOutputStream(file);

        obj.writeObject(empl);
        System.out.println("Serialized data is saved in employee.ser");
    }
}
