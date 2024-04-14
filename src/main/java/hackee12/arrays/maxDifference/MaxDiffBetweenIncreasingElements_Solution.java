package hackee12.arrays.maxDifference;

public class MaxDiffBetweenIncreasingElements_Solution implements MaxDiffBetweenIncreasingElements_Problem {
    @Override
    public int maximumDifference(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i-1]);
            max = Math.max(max, nums[i] - min);
        }
        return max > 0 ? max : -1;
    }
}
