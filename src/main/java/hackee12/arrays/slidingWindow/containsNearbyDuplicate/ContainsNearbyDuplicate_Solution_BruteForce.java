package hackee12.arrays.slidingWindow.containsNearbyDuplicate;

public class ContainsNearbyDuplicate_Solution_BruteForce implements ContainsNearbyDuplicate_Problem {

    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Time: O(n * k)
        // Space: O(1)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k; j++) {
                if (j < nums.length && nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsNearbyDuplicate_Solution_BruteForce solution = new ContainsNearbyDuplicate_Solution_BruteForce();
        if (solution.containsNearbyDuplicate(new int[]{0, 1, 0}, 0)) throw new RuntimeException("This is a bug.");
        if (solution.containsNearbyDuplicate(new int[]{0, 1, 0}, 1)) throw new RuntimeException("This is a bug.");
        if (!solution.containsNearbyDuplicate(new int[]{0, 1, 0}, 2)) throw new RuntimeException("This is a bug.");
        if (!solution.containsNearbyDuplicate(new int[]{0, 1, 2, 1}, 2)) throw new RuntimeException("This is a bug.");
    }
}
