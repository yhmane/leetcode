# 해설
* 두 가지의 풀이가 존재한다
1. 문자열 반으로 나눈후 거꾸로 동등비교
2. 수치로 비교

---
모두 시간복잡도는 O(n)이 나온다. 나의 경우는 숫자로 푸는것을 좋아하기에 2번으로 풀이
```java
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
```