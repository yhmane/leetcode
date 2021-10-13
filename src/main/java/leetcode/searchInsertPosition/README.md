# 해설
## 순차탐색
```java
public int searchInsert1(int[] nums, int target) {
    int length = nums.length;
    for (int i = 0; i < length; i++) {
        if (nums[i] == target) {
            return i;
        }

        if (target < nums[i]) {
            return i;
        }
    }
    return length;
}
```
## 이진탐색
```java
public int searchInsert2(int[] nums, int target) {
    int first = 0;
    int last = nums.length - 1;
    while (first <= last) {
        int mid = (first + last) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            first = mid + 1;
        } else {
            last = mid - 1;
        }
    }
    return first;
}
```

순차탐색의 경우 O(n), 이진탐색의 경우 O(logN)이다<br/>
이진탐색을 이용해서 중앙값을 탐색하면 더 빠르게 찾을 수 있다