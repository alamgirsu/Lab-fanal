
interface Flyable {
    void fly();
}


interface Walkable {
    void walk();
}

class Bird implements Flyable, Walkable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
    @Override
    public void walk() {
        System.out.println("Bird is walking.");
    }
}


public class Example10 {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.fly();
        myBird.walk();
    }
}