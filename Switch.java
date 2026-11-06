import java.util.Scanner;
public class Switch {
public static void main(String[] args){
    Scanner pk = new Scanner(System.in);
    int a = pk.nextInt();
    char op = pk.next().charAt(0);
    int b = pk.nextInt();
switch (op) {
case '+':
    System.out.println(a+b);
  break;
  case '-':
  System.out.println(a-b);
  break;
  case '*':
  System.out.println(a*b);
  break;
  case '/':
  if(b!=0){
    System.out.println(a/b);
  }
  else{
    System.out.println("Division is not possible");
  }
  break;
  case '%':
  System.out.println(a%b);
  break;
  default:
    System.out.println("Invalid choice");
}

}
    
}