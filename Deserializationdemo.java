import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
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
        // TODO Auto-generated method stub
        return super.toString();
    }
}

public class Deserializationdemo {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee(10, "Gagan", 40000.00);

        // Serilization process
        FileOutputStream file = new FileOutputStream("employee2.ser");
        ObjectOutputStream obj = new ObjectOutputStream(file);

        obj.writeObject(emp);
        System.out.println("Serilization Completed");

        // Deserilization process
        FileInputStream file2 = new FileInputStream("Employee2.ser");
        ObjectInputStream obj2 = new ObjectInputStream(file2);

        emp = (Employee) obj2.readObject();

        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Salary: " + emp.getSalary());

    }
}
