
interface Calculable {
    int add(int a, int b);
}


class SimpleCalculator implements Calculable {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}


public class Example6 {
    public static void main(String[] args) {
        Calculable calc = new SimpleCalculator();
        int sum = calc.add(5, 7);
        System.out.println("Sum: " + sum); 
    }
}