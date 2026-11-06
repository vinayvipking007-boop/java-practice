import java.util.*;
class Scanner {
    public static int average(int a , int b, int c) {
        int average;
        average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         System.out.println("average = " + (a+b+c)/3);
        }
    }