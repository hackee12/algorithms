package hackee12.arrays.runningSum;

public class RunningSum1D_Solution {
    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length < 1) {
            throw new IllegalArgumentException();
        }
        // nums = Arrays.copyOf(nums, nums.length);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
