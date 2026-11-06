import java.util.Scanner;
public class Arrayone_elementsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr ={232, 495, 2, 468, 500};
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum"+sum);
    }
}
