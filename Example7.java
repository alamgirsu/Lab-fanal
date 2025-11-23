
interface SoundMaker {
    void makeSound();
}


class Dog implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}


public class Example7 {
    public static void main(String[] args) {
        SoundMaker myDog = new Dog();
        myDog.makeSound(); // 
    }
}