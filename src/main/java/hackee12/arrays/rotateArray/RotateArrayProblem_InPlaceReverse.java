package hackee12.arrays.rotateArray;

public class RotateArrayProblem_InPlaceReverse implements RotateArrayProblem {
    @Override
    public void rotate(int[] nums, int k) {
        int times = k < nums.length ? k : k % nums.length;
        if (times > 0) {
            reverse(nums, 0, nums.length);
            reverse(nums, 0, times);
            reverse(nums, times, nums.length - times);
        }
    }

    private void reverse(int[] nums, int off, int len) {
        for (int i = off, j = off + len - 1; i <j; i++, j--) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}
