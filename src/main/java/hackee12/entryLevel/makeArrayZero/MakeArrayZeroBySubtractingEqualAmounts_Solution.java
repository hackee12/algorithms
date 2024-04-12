package hackee12.entryLevel.makeArrayZero;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MakeArrayZeroBySubtractingEqualAmounts_Solution implements MakeArrayZeroBySubtractingEqualAmounts_Problem {
    @Override
    public int minimumOperations(int[] nums) {
        return Arrays.stream(nums).filter(num -> num > 0).boxed().collect(Collectors.toSet()).size();
    }
}
