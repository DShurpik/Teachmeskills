package CodeWars.level_8.Boolean;

import org.testng.Assert;

public class Is_n_divisible_by_x_and_y {
    public static void main(String[] args) {
        Assert.assertTrue(isDivisible(12,4,3));
        Assert.assertFalse(isDivisible(3,3,4));
    }
    public static boolean isDivisible(long n, long x, long y) {
        if (n % x == 0 && n % y == 0) return true;
        return false;
    }
}
