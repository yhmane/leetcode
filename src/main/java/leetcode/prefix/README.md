# 해설
* 완전탐색
* 분할정복
* 이진탐색

> 대략 3가지 풀이법이 있지만, 아직 분할정복이나 이진탐색은 공부를 안해서 모르겠다
> 완전탐색 방법을 이용

LCP 문제는 정말 많이 나오는 것 같다. 여기서는 vertical 방법으로 풀이

```java
public class Prefix {
    public String longestCommonPrefix(String[] strs) {
        int len = strs[0].length();
        
        for (int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
```

### 참조
* https://eunhyejung.github.io/algorithm/2018/07/30/leetcode14-problem-solving.html