#  해설
* 일치할 경우 시작하는 첫번째 인덱스를 return
* 일치하는 케이스가 없을 경우 -1을 리턴

```java
int length = needle.length();

for (int i = 0; i < haystack.length() - length + 1; i++) {
    if (haystack.substring(i, i + length).equals(needle)) {
        return i;
    }
} 
```

이번 문제는 딱히 복잡한 부분은 없는거 같다
시간복잡도는 for문 n길이 만큼 반복이므로 O(n)
