package hackee12.binarySearch.basic;

import java.util.Objects;

public class BasicSolution {

    public int search(int[] nums, int target) {
        if (Objects.isNull(nums) || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return nums[left] == target ? left : -1;
    }
}
