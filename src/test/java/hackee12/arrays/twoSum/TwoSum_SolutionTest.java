package hackee12.arrays.twoSum;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class TwoSum_SolutionTest {

    @Parameter(0)
    public int[] numbers;

    @Parameter(1)
    public int twoSum;

    @Parameter(2)
    public int[] sortedExpecteds;

    @Parameterized.Parameters
    public static Object[][] parameters() {
        return new Object[][]{
                {new int[]{0, 1}, 1, new int[]{0, 1}},
                {new int[]{1, 1}, 2, new int[]{0, 1}},
                {new int[]{0, 1, 2}, 3, new int[]{1, 2}},
                {new int[]{0, 1, 2, 3, 4}, 6, new int[]{2, 4}},
        };
    }

    @Test
    public void test() {
        List<TwoSum_Problem> solutions = Arrays.asList(
                new TwoSum_NaiveOnePassMapAndQueueSolution(),
                new TwoSum_OnePassMapSolution());

        for (TwoSum_Problem twoSum : solutions) {
            int[] actuals = twoSum.twoSum(numbers, this.twoSum);
            Arrays.sort(actuals);
            assertArrayEquals(twoSum.getClass().getSimpleName(), sortedExpecteds, actuals);
        }
    }
}