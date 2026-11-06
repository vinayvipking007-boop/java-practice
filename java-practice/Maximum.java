
public class Maximum {
    public static void main(String[] args) {
        int[] nums = {60, 30, 20, 10};
        int max = nums[0], min = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
