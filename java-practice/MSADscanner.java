import java.util.Scanner;
public class MSADscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("Multiply = " + (a * b));
        System.out.println("Subtract = " + (a - b));
        System.out.println("Add = " + (a + b));
        if (b == 0) System.out.println("Divide = undefined (division by zero)");
        else System.out.println("Divide = " + (a / b));
        sc.close();
    }
}
