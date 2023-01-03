package hackee12.arrays.twoSum;

import java.util.Arrays;

public class SortedTwoSum_NaiveSolution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            final int a = numbers[i];
            final int b = target - a;
            final int x = Arrays.binarySearch(numbers, i + 1, numbers.length, b);
            if (x >= 0) {
                return new int[]{i, x};
            }
        }
        throw new IllegalArgumentException();
    }
}