package hackee12.binary_search.search4range;

public class LinearSolution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        if (nums.length != 0) {
            int i = 0;
            while (i < nums.length && nums[i] < target) i++;
            if (i < nums.length && nums[i] == target) res[0] = i;
            while (i+1 < nums.length && nums[i+1] == target) i++;
            if (i < nums.length && nums[i] == target) res[1] = i;
        }
        return res;
    }
}
