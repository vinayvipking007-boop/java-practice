public class count {
    public static int countdigits(int n){
    int count = 0;
    while(n>0){
   count++;
   n = n/10;
 }
 return count;
} 
public static void main(String[]args){
  int ans = countdigits (12345);
  System.out.println(ans);
}
}
