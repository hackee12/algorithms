package hackee12.binarySearch.search4range;

public class LogNSolution {

    public int[] searchRange(int[] nums, int target) {
        int[] reply = new int[]{-1, -1};
        if (nums.length > 0) {
            int left = leftBorder(nums, target);
            if (nums[left] != target) {
                return reply;
            }
            int right = rightBorder(nums, target);
            return new int[]{left, right};
        }
        return reply;
    }

    private int leftBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int rightBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left] == target ? left : left - 1;
    }
}
