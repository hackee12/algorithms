package hackee12.arrays.majorityElement;

import java.util.Arrays;

public class MajorityElementSortSolution implements MajorityElementProblem {
    @Override
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
