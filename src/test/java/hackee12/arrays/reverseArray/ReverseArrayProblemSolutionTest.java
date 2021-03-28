package hackee12.arrays.reverseArray;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ReverseArrayProblemSolutionTest {

    private static final ReverseArrayProblem solution = new ReverseArrayProblemSolution();

    @Parameter
    public int[] nums;

    @Parameter(1)
    public int[] expected;

    @Parameters
    public static Object[][] parameters() {
        return new Object[][]{
                {
                        new int[0],
                        new int[0]
                },
                {
                        new int[]{1},
                        new int[]{1}
                },
                {
                        new int[]{1, 2},
                        new int[]{2, 1}
                },
                {
                        new int[]{1, 2, 3},
                        new int[]{3, 2, 1}
                },
                {
                        new int[]{1, 2, 3, 4},
                        new int[]{4, 3, 2, 1}
                },
                {
                        new int[]{1, 2, 3, 4, 5},
                        new int[]{5, 4, 3, 2, 1}
                },
                {
                        new int[]{1, 2, 3, 4, 5, 6},
                        new int[]{6, 5, 4, 3, 2, 1}
                },
                {
                        new int[]{21, 20, 13, 4, 57, 16},
                        new int[]{16, 57, 4, 13, 20, 21}
                },
        };
    }

    @Test
    public void testNoFailOnNull() {
        solution.reverse(null);
    }

    @Test
    public void testSolution() {
        solution.reverse(nums);
        Assert.assertArrayEquals(expected, nums);
    }
}