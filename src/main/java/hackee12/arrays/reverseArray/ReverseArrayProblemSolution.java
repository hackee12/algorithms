package hackee12.arrays.reverseArray;

import hackee12.MySolution;

public class ReverseArrayProblemSolution implements ReverseArrayProblem, MySolution {

    @Override
    public void reverse(int[] nums) {
        if (nums != null && nums.length > 1) {
            for (int li = 0, ri = nums.length - 1; li < ri; li++, ri--) {
                int t = nums[li];
                nums[li] = nums[ri];
                nums[ri] = t;
            }
        }
    }
}
