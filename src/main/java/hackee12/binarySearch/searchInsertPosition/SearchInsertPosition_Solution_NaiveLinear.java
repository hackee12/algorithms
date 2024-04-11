package hackee12.binarySearch.searchInsertPosition;

public class SearchInsertPosition_Solution_NaiveLinear implements SearchInsertPosition_Problem {
    @Override
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && target > nums[i]) {
            i++;
        }
        return i;
    }
}
