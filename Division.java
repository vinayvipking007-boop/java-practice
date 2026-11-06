import java.util.Scanner;
public class Division {
    public static int divide(int a, int b){
        if(b == 0){
            return 0;
        }
        return a/b;
    }
    public static void main(String[]agrs){
   Scanner div = new Scanner(System.in);
   System.out.println("enter the first number");
   int a = div.nextInt();
   System.out.println("enter the second number");
   int b = div.nextInt();
   System.out.println("division = "+(a/b));
   div.close();
}
}
