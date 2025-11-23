

interface Inheritance2 {
    double PI = 3.14159; 
    int MAX_VALUE = 100; 
}


class Calculator implements Inheritance2 {
    public double calculateArea(double radius) {
        return PI * radius * radius;
    }
    public void displayMax() {
        System.out.println("Maximum value is: " + MAX_VALUE);
    }
}


public class Example2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Area: " + calc.calculateArea(5.0));
        calc.displayMax();
    }
}