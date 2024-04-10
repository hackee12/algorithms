package hackee12.arrays.slidingWindow.containsNearbyDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearByDuplicate_Solution_SlidingWindow implements ContainsNearbyDuplicate_Problem {
    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}
