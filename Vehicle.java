
package extrapolymorphism2;

public class Vehicle {

    private int speed;

    void speedUp() {
        speed += 10;
    }

    int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {

    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("Car speed increased by 22 units.");
    }
}

class Motorcycle extends Vehicle {

    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("Motorcycle speed increased by 12 units.");
    }
}

class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + motorcycle.getSpeed());

        car.speedUp();
        motorcycle.speedUp();

        System.out.println("Car speed after speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + motorcycle.getSpeed());
    }
}
