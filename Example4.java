
interface Vehicle {
    void start();
}


class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}


class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a kick.");
    }
}


public class Example4 {
    public static void serviceVehicle(Vehicle v) {
        v.start(); 
    }
    public static void main(String[] args) {
        serviceVehicle(new Car());
        serviceVehicle(new Bike());
    }
}