public class Evennumberusingbinary{
 public static void main(String[]args){
    System.out.println("Even number");
    for(int i=1; i<=100; i++){
        if((i & 1) == 0){
            System.out.print(i +" ");
        }
    }
System.out.println();
 }
}
