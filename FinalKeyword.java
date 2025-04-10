class Vehicle 
{ 
    final int speed = 100;
    public void run() 
    { 
        System.out.println("Vehicle speed is " + speed); 
    } 
class FinalKeyword 
{ 
    public static void main(String[] args) 
    { 
        Vehicle vehicle = new Vehicle(); 
        vehicle.run();
         
        //vehicle.speed = 200; 
        // cannot change final variable
    } 
}