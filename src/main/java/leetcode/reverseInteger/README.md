# 해설
* 두 가지의 풀이가 존재한다
1. 문자열로 풀이
    * 먼저 부호를 가져온다 0 미만
    * StringBuilder를 이용하여 뒷 자리수부터 append 한다
    * 모두 붙인후 int의 범위를 초과하면 exception으로 처리하여 0 출력
    * int 의 범위에 속할 경우 int로 출력
    
```java
class reverseInteger {
    public int reverse(int x) {
        int result = 0;
    
        try {
            String[] reverse = String.valueOf(Math.abs(x)).split("");
            StringBuilder reverseStr = new StringBuilder();
        
            if (x == 0 ){
               return 0;
            }
            
            if (x < 0) {
                reverseStr.append("-");
            }
            
            for (int i = reverse.length - 1; i >= 0; i--) {
                reverseStr.append(reverse[i]);
            }
            
            result = Integer.parseInt(reverseStr.toString());
        } catch (Exception e) {
            result = 0;
        }
        
        return result;
    }
}
```
---
2. 숫자 풀이
    * 10으로 나눈 나머지를 더해준다
    * 기존 숫자를 10으로 나누어준다
    * 10으로 나눌 수 없을때까지 반복
    
```java
public class reverseInteger {

    public int reverse(int x) {
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
```

---
* 이 문제는 String으로 하나씩 빼서 처리도 가능하지만 수학을 이용하면 좀더 효율적으로 접근할 수 있다
* 시간복잡도 O(logN)
   * N번 입력
   * 1: N/2
   * 2: N/4
   * 3: N/8
   * x: (1/2)^nx = 1
   * 2^x = n
   * x = lon2N
   * 지수를 버려서 시간복잡도는 O(logN)
   