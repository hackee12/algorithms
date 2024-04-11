package hackee12.entryLevel.containsDuplicate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayContainsDuplicate_Solution_Oneliner implements ArrayContainsDuplicate_Problem {
    @Override
    public boolean containsDuplicate(int[] nums) {
        // Time: O(n)
        // Space: O(n)
        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() < nums.length;
    }
}
