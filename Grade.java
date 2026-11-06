import java.util.Scanner;
public class Grade {
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n>90){
    System.out.println("A");
}
else if(n>89){
    System.out.println("B");
}
else if(n>79){
System.out.println("C");
}
else if(n>69){
    System.out.println("D");
}
else{
    System.out.println("fail");
}
    }
}
