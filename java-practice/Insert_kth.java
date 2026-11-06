
import java.util.Arrays;
public class Insert_kth {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0};
        int position = 2; // zero-based insertion index
        int value = 25;
        for (int i = arr.length - 1; i > position; i--) arr[i] = arr[i - 1];
        arr[position] = value;
        System.out.println(Arrays.toString(arr));
    }
}
