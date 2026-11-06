
public class major {
    public static int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        int occurrences = 0;
        for (int num : nums) if (num == candidate) occurrences++;
        if (occurrences <= nums.length / 2) throw new IllegalArgumentException("No majority element");
        return candidate;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
