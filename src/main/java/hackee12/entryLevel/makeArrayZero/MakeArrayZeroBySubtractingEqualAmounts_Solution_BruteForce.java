package hackee12.entryLevel.makeArrayZero;

import java.util.Arrays;

public class MakeArrayZeroBySubtractingEqualAmounts_Solution_BruteForce
        implements MakeArrayZeroBySubtractingEqualAmounts_Problem {
    @Override
    public int minimumOperations(int[] nums) {
        int cycles = 0;
        int minPositive = getMinPositive(nums);
        while (minPositive > 0) {
            cycles++;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    nums[i] -= minPositive;
                }
            }
            minPositive = getMinPositive(nums);
        }
        return cycles;
    }

    private int getMinPositive(int[] nums) {
        return Arrays.stream(nums).filter(num -> num > 0).min().orElse(0);
    }
}
