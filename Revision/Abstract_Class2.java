abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts with kick");
    }
}

class Abstract_Class2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        vehicle.start();
        vehicle.fuel();
    }
}