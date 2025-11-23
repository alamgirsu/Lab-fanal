
package extraabstraction4;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat() { System.out.println("Lion eats meat."); }
    void sleep() { System.out.println("Lion sleeps on grassland."); }
}

class Tiger extends Animal {
    void eat() { System.out.println("Tiger eats meat."); }
    void sleep() { System.out.println("Tiger sleeps in jungle."); }
}

class Deer extends Animal {
    void eat() { System.out.println("Deer eats grass."); }
    void sleep() { System.out.println("Deer sleeps in open fields."); }
}

class Main {
    public static void main(String[] args) {
        new Lion().eat();
        new Lion().sleep();

        new Tiger().eat();
        new Tiger().sleep();

        new Deer().eat();
        new Deer().sleep();
    }
}
