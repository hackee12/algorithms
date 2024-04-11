package hackee12.binarySearch.searchInsertPosition;

public class SearchInsertPosition_Solution_BinarySearchLogN implements SearchInsertPosition_Problem {
    @Override
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return target <= nums[left] ? left : left + 1;
    }
}
