package hackee12.arrays;

import hackee12.MySolution;

public class RotateArrayProblem_Initial implements RotateArrayProblem, MySolution {

    @Override
    public void rotate(int[] nums, int k) {
        int times = k < nums.length ? k : k % nums.length;
        int[] buf = new int[times];
        System.arraycopy(nums, nums.length - times, buf, 0, times);
        System.arraycopy(nums, 0, nums, times, nums.length - times);
        System.arraycopy(buf, 0, nums, 0, times);
    }
}
