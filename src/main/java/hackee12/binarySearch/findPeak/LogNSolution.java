package hackee12.binarySearch.findPeak;

public class LogNSolution {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException();
        if (nums.length == 1) return 0;
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] > nums[left + 1]) return left;
        if (nums[right] > nums[right - 1]) return right;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (mid > 0 && nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) return mid;
            if (nums[mid + 1] > nums[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}