package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // O(n^2)
//        int size = nums.length;
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (nums[i] + nums[j] == target)  {
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return new int[2];

        // O(n)
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

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = twoSum(nums, target);

        System.out.println(ints[0] + ", " + ints[1]);
    }

    /**
     * 해결책1.
     * 기본적인 방법으로 풀경우 이중 for문이 된다 .. 따라서 O(n^2)라는 시간 복잡도가 나온다
     *
     * 해결책2.
     * Map을 이용해서 target - index[i] 값을 이용하자.
     * 둘의 값이 매핑되면 target과 일치하는것, 시간복잡도는 O(n)
     */
}
