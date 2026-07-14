import java.util.Scanner;
public class Division {
    public static int divide(int a, int b){
        if(b == 0){
            return 0;
        }
        return a/b;
    }
    public static void main(String[]agrs){
   Scanner pk = new Scanner(System.in);
   System.out.println("enter the first number");
   int a = pk.nextInt();
   System.out.println("enter the second number");
   int b = pk.nextInt();
   System.out.println("division = "+(a/b));
}
}
