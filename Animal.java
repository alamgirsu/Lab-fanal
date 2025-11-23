
package extrapolymorphism;

public class Animal {

    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Bird extends Animal {

    @Override
    void makeSound() {
        System.out.println("The bird chirps");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal bird = new Bird();
        Animal cat = new Cat();

        animal.makeSound();
        bird.makeSound();
        cat.makeSound();
    }
}
