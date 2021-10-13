# 해설
val 값이 같지 않을때 해당 인덱스의 값을 교체해주면 된다
N번 만큼 시행하기에 시간복잡도는 O(n)이다

```java
if (nums[i] != val) { // 
    nums[index++] = nums[i];     
}   
```