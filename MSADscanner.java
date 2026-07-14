import java.util.Scanner;
public class MSADscanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the first number");
        int a = sc.nextInt();
        System.out.println("Enetr the second number");
        int b = sc.nextInt();
        System.out.println("multiply = "+(a*b));
        System.out.println("subtract = "+(a-b));
        System.out.println("add = "+(a+b));
        System.out.println("divide = "+(a%b));
        sc.close();
    }
}
