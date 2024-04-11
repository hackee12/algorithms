package hackee12.binarySearch.searchInsertPosition;

/**
 * Search for a target index in a sorted array of integers.
 * If the target is found return its index.
 * Else return the index where the target should be.
 * <p>
 * Constraints:
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums contains distinct values sorted in ascending order
 * -10^4 <= target <= 10^4
 */
public interface SearchInsertPosition_Problem {
    int searchInsert(int[] nums, int target);
}
