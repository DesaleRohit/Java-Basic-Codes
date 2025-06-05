interface Engine {
    void start();
    void stop();
}

abstract class Vehicle implements Engine {
    public void stop() {
        System.out.println("Vehicle stopped.");
    }
    abstract void speed();
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car started.");
    }
    public void speed() {
        System.out.println("Car is running at 60 km/h");
    }
}

public class InterfaceAbstractDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.speed();
        car.stop();
    }
}
