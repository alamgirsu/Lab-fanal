package extrapolymorphism4;

public class Sports {

    void play() {
        System.out.println("Playing a sport...\n");
    }

}

class Football extends Sports {

    @Override
    void play() {
        System.out.println("Playing football...");
    }
}

class Basketball extends Sports {

    @Override
    void play() {
        System.out.println("Playing basketball...");
    }
}

class Rugby extends Sports {

    @Override
    void play() {
        System.out.println("Playing rugby...");
    }
}

class Main {

    public static void main(String[] args) {
        Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
