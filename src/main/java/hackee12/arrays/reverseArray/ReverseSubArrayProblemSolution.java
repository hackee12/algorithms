package hackee12.arrays.reverseArray;

import hackee12.MySolution;

public class ReverseSubArrayProblemSolution implements ReverseSubArrayProblem, MySolution {
    @Override
    public void reverse(int[] nums, int from, int to) {
        if (nums == null) {
            return;
        }
        if (from < 0 || from >= nums.length) {
            return;
        }
        if (to < 0 || to > nums.length) {
            return;
        }
        for (int left = from, right = to - 1; left < right; left++, right--) {
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
        }
    }
}
