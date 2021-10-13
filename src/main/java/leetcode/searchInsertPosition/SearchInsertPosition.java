package leetcode.searchInsertPosition;

public class SearchInsertPosition {

    /**
     * 순차탐색
     * 처음부터 끝까지 흟는다
     * O(n)
     */
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

    /**
     * 이진탐색
     * 중앙값 비교하여 탐색
     * O(logN)
     */
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
}
