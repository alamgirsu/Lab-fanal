
interface Inheritance1 {
    void draw();
}


class Circle implements Inheritance1 {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}


public class Example1 {
    public static void main(String[] args) {
        Inheritance1 s = new Circle();
        s.draw(); // আউটপুট: Drawing a Circle
    }
}