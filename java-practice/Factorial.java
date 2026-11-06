
import java.util.Scanner;
public class Factorial {
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be non-negative");
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0 || n > 20) System.out.println("Enter a number from 0 to 20.");
        else System.out.println(factorial(n));
        sc.close();
    }
}
