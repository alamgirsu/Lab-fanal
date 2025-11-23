public class Inheritance2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}

class Vehicle {
    public void drive() {
        System.out.println("Vehicle is driving.");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car."); 
    }
}