package hackee12.arrays.maxDifference;

public class MaxDiffBetweenIncreasingElements_Solution_BruteForce
        implements MaxDiffBetweenIncreasingElements_Problem {
    @Override
    public int maximumDifference(int[] nums) {
        // Constraints are small.
        // Brute Force is good enough.
        int maxDif = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                maxDif = Math.max(maxDif, nums[j] - nums[i]);
            }
        }
        return maxDif > 0 ? maxDif : -1;
    }
}
