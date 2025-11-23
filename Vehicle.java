
package extrainheritance2;

public class Vehicle {
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
    public class Car extends Vehicle{
     @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive(); 
    }
}
}