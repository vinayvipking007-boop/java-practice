public class Maximum {
    public static void main(String[]agrs){
        int[] nums = {60, 30, 20, 10};
       int  max = nums[0];
       int mini = nums[0];
       for(int i = 0; i < nums.length; i++) {
        // maximum value calculate for  give data.
        if(nums [i] >max){
        max = nums[i];
       }
       // minimum value calculate for given data.
       else if( nums [i] <mini){
        mini = nums[i];
       }
       }
       System.out.println("maximum = "+ max);
       System.out.println("minimum = "+ mini);
}
    
    }
    

