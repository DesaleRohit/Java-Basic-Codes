class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class Function_Overriding {
    public static void main(String[] args) {
        Vehicle myVehicle = new Bike(); 
        myVehicle.run(); 
    }
}
