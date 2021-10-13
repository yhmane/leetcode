package leetcode.palindrome;

public class Palindrome {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int num = x;
        int reverseNum = 0;
        while (num > 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num /= 10;
        }
        return x == reverseNum;
    }
}
