import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/':
                if (b == 0) System.out.println("Division by zero is not allowed");
                else System.out.println(a / b);
                break;
            case '%':
                if (b == 0) System.out.println("Modulo by zero is not allowed");
                else System.out.println(a % b);
                break;
            default: System.out.println("Invalid operator");
        }
        sc.close();
    }
}
