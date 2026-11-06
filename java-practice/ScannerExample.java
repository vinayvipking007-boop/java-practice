import java.util.Scanner;
public class ScannerExample {
    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Average = " + average(a, b, c));
        sc.close();
    }
}
