import java.util.Scanner;
public class Division {
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        if (b == 0) System.out.println("Division by zero is not allowed.");
        else System.out.println("Division = " + divide(a, b));
        sc.close();
    }
}
