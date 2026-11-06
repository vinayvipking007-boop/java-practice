import java.util.Scanner;
public class Reverseclassobject {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i = n; i>=1; i--){
        for(int j = n; j>=n-i+1; j--){
        System.out.print(j+" ");
     }
     System.out.println();
    }
    }
    
}
