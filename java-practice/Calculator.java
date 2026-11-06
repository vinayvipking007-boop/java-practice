
public class Calculator {
    static class CalculatorMethods {
        int add(int a, int b) { return a + b; }
        int add(int a, int b, int c) { return a + b + c; }
        double add(double a, double b) { return a + b; }
    }
    public static void main(String[] args) {
        CalculatorMethods cal = new CalculatorMethods();
        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(10, 20, 30));
        System.out.println(cal.add(15.5, 20.2));
    }
}
