abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Vehicle need fule...");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.fuel();
    }
}