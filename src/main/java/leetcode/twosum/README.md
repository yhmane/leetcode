# 해설
* 기본적인 방법으로 풀었을 경우, 이중 for문의 시간복잡도는 O(n^2)이다.
* 시간복잡도를 낮추려면 이중 for문을 제거해야 한다.
```java
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int size=nums.length;
        for(int i=0;i<size -1;i++){
            for(int j=i+1;j<size; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }
}
```


* Map을 이용해 정수값과 인덱스를 저장하자
* 시간복잡도는 O(n)이다
```java
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }
}
```