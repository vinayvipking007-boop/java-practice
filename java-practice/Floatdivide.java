
public class Floatdivide {
    public static float divide(float a, float b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
    public static void main(String[] args) {
        float a = 9;
        float b = 12;
        System.out.println(divide(a, b));
    }
}
