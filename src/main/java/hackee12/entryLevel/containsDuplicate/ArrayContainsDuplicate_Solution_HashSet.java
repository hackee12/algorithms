package hackee12.entryLevel.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDuplicate_Solution_HashSet implements ArrayContainsDuplicate_Problem {
    @Override
    public boolean containsDuplicate(int[] nums) {

        // Time: O(n)
        // Space: O(n)

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
