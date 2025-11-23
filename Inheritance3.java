
public class Inheritance3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 8.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height; 
    }
}