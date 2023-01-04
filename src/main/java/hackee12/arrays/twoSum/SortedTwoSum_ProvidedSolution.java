package hackee12.arrays.twoSum;

public class SortedTwoSum_ProvidedSolution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0, j = numbers.length - 1; i < j; ) {
            final int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException();
    }
}
