package leetcode.reverseInteger;

public class reverseInteger {

    public static int reverse(int x) {
        long result = 0;

        while (x != 0) {
            result *= 10;
            result += x % 10;
            x /= 10;
        }

        if (
            -Integer.MAX_VALUE <= result &&
            result <= Integer.MAX_VALUE
        ) {
            return (int) result;
        } else {
            return 0;
        }
    }
}
