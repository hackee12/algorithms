package hackee12.arrays.slidingWindow.containsNearbyDuplicate;

/**
 * For integer array nums[] and integer distance k
 * Return true if there are 2 distinct indices (i,j) so that nums[i]==nums[j] and abs(i-j)<=k.
 * Constraints:
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 0 <= k <= 10^5
 */
public interface ContainsNearbyDuplicate_Problem {

    boolean containsNearbyDuplicate(int[] nums, int k);
}
