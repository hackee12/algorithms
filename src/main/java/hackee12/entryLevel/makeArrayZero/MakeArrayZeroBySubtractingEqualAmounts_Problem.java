package hackee12.entryLevel.makeArrayZero;

/**
 * For non-empty non-negative integer array nums[]
 * Return the minimum number of operations required to zero every element.
 * Zero every element via
 * 1. choose the smallest positive element in the array
 * 2. subtract this amount from every positive element in the array
 * 3. repeat until all elements become zeros.
 * Constraints:
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 */
public interface MakeArrayZeroBySubtractingEqualAmounts_Problem {
    int minimumOperations(int[] nums);
}
