package hackee12.entryLevel.containsDuplicate;

import java.util.Arrays;

public class ArrayContainsDuplicate_Solution_Sort implements ArrayContainsDuplicate_Problem {
    @Override
    public boolean containsDuplicate(int[] nums) {
        // Time: O(n*log(n))
        // Space: O(1)

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}
