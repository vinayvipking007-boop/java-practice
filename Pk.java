public class Pk {
    public static int sumdigits(int n){
        int sum = 0;
        while(n>10){
        int digit = n % 10;
           sum = sum +digit;
           n = n/10;
        }
 return sum;
    }
    
}
