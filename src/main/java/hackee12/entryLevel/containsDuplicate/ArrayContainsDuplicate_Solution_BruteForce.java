package hackee12.entryLevel.containsDuplicate;

public class ArrayContainsDuplicate_Solution_BruteForce implements ArrayContainsDuplicate_Problem {
    @Override
    public boolean containsDuplicate(int[] nums) {
        // Time: O(n^2)
        // Space: O(1)
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
