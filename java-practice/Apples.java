public class Apples {
    public static void main(String[] args){
   int[] apples = {5,5,5,5,10,5,5,5};
   int left = apples[0] + apples[1]+ apples[2]+apples[3];
   int right = apples[4] + apples[5] + apples[6] + apples[7];
   int count = 0;
   if(left > right){
        if(apples[0] > apples[1])
            count = 0;
        else if(apples[1]> apples[0])
            count = 1;
        else
            count = 2;
        }
        else if(left < right){
            if(apples[3] > apples[4])
                count = 3;
            else if(apples[4] > apples[3])
                count = 4;
            else
                count = 5;
        }
        else{
            if(apples[3] > apples[4])
                count = 3;
            else if(apples[4] > apples[3])
                count = 4;
            else
                count = 5;
        }
    }
}
