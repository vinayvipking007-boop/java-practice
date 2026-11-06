public class YPowerofX {
    public static boolean isPower(int x, int y) {
        if (x <= 0 || y <= 0) return false;
        if (x == 1) return y == 1;
        while (y % x == 0) y /= x;
        return y == 1;
    }
    public static void main(String[] args) {
        System.out.println(isPower(2, 16)); // true
        System.out.println(isPower(3, 16)); // false
    }
}
