package hackee12.arrays.slidingWindow.containsNearbyDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearByDuplicate_Solution_2StepSlidingWindowDirty implements ContainsNearbyDuplicate_Problem {
    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (k == 0) return false;

        Set<Integer> window = new HashSet<>() ;

        //|0123|456789
        for (int i = 0; i < Math.min(nums.length, k); i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
        }
        //0123|4|56789
        for (int i = k; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.remove(nums[i - k]);
            window.add(nums[i]);
        }
        return false;
    }
}
